CREATE TABLE vehicle
(
    id           UUID    NOT NULL,
    number_plate VARCHAR(255),
    car_model    VARCHAR(255),
    year         INTEGER NOT NULL,
    last_parked  TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT pk_vehicle PRIMARY KEY (id)
);

CREATE TABLE parking_spot
(
    id           BIGINT  NOT NULL,
    floor_number INTEGER NOT NULL,
    vehicle_type SMALLINT,
    status       SMALLINT,
    CONSTRAINT pk_parkingspot PRIMARY KEY (id)
);

CREATE TABLE billing
(
    id              UUID NOT NULL,
    checked_in      TIMESTAMP WITHOUT TIME ZONE,
    checked_out     TIMESTAMP WITHOUT TIME ZONE,
    vehicle_id      UUID,
    parking_spot_id BIGINT,
    CONSTRAINT pk_billing PRIMARY KEY (id)
);

ALTER TABLE billing
    ADD CONSTRAINT FK_BILLING_ON_PARKING_SPOT FOREIGN KEY (parking_spot_id) REFERENCES parking_spot (id);

ALTER TABLE billing
    ADD CONSTRAINT FK_BILLING_ON_VEHICLE FOREIGN KEY (vehicle_id) REFERENCES vehicle (id);