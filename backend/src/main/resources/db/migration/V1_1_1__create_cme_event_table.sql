CREATE TABLE cme (
    id BIGSERIAL PRIMARY KEY,
    activity_id VARCHAR,
    catalogs VARCHAR,
    start_time TIMESTAMPTZ NOT NULL,
    note VARCHAR,
    submission_time TIMESTAMPTZ NOT NULL,
    link VARCHAR,
    is_most_accurate BOOLEAN,
    latitude INT,
    longitude INT,
    half_angle INT,
    speed INT,
    types VARCHAR,
    tilt REAL,
    minor_half_width REAL,
    speed_at_height FLOAT
)
