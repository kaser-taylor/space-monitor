ALTER TABLE cme DROP CONSTRAINT cme_pkey;
ALTER TABLE cme ADD PRIMARY KEY (id, start_time);
ALTER TABLE cme ADD CONSTRAINT cme_activity_id_start_time_key UNIQUE (activity_id, start_time);

ALTER TABLE geo_magnetic_storm DROP CONSTRAINT geo_magnetic_storm_pkey;
ALTER TABLE geo_magnetic_storm ADD PRIMARY KEY (id, start_time);
ALTER TABLE geo_magnetic_storm ADD CONSTRAINT gme_gst_id_start_time_key UNIQUE (gst_id, start_time);



CREATE EXTENSION IF NOT EXISTS timescaledb;

SELECT create_hypertable(
    'cme',
    by_range('start_time', INTERVAL '30 days'),
    migrate_data => true
);

SELECT create_hypertable(
    'geo_magnetic_storm',
    by_range('start_time', INTERVAL '30 days'), migrate_data => true
);
