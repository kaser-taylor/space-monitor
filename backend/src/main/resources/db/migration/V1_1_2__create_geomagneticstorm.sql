CREATE TABLE geo_magnetic_storm (
    id BIGSERIAL PRIMARY KEY,
    gst_id VARCHAR NOT NULL,
    start_time TIMESTAMPTZ NOT NULL,
    observed_time TIMESTAMPTZ NOT NULL,
    link VARCHAR,
    activity_id VARCHAR,
    submission_time TIMESTAMPTZ,
    kp_index INT,
    source VARCHAR
)
