
CREATE TABLE "persons" (
  "ID_Person" SERIAL PRIMARY KEY,
  "first_name" VARCHAR(255) NOT NULL,
  "last_name" VARCHAR(255) NOT NULL,
  "dni" VARCHAR(255) UNIQUE NOT NULL,
  "user_type" VARCHAR(20) NOT NULL,
  "blood_group" VARCHAR(5),
  "rh_factor" VARCHAR(1),
  "birthdate" DATE,
  "address" VARCHAR(255),
  "phone" VARCHAR(20) UNIQUE,
  "email" VARCHAR(255) UNIQUE,
  "last_donation" DATE,
  "role" VARCHAR(50)
);

CREATE TABLE "blood_units" (
  "ID_Unit" SERIAL PRIMARY KEY,
  "donor_id" INT,
  "blood_type" VARCHAR(5) NOT NULL,
  "rh_factor" VARCHAR(1) NOT NULL,
  "donation_date" DATE NOT NULL,
  "status" VARCHAR(50) NOT NULL,
  "volume_content" NUMERIC
);

CREATE TABLE "donation_events" (
  "ID_Event" SERIAL PRIMARY KEY,
  "event_date" DATE,
  "city" VARCHAR(255),
  "address" VARCHAR(255),
  "description" TEXT,
  "status_event" VARCHAR(255)
);

CREATE TABLE "donation_records_events" (
  "ID_Donation" SERIAL PRIMARY KEY,
  "donor_event_id" INT,
  "event_id" INT,
  "unit_id" INT
);

CREATE TABLE "event_responsible_persons" (
  "ID_Event_Responsible_Person" SERIAL PRIMARY KEY,
  "staff_event_id" INT,
  "event_id" INT
);

CREATE TABLE "analysis_results" (
  "ID_Result" SERIAL PRIMARY KEY,
  "unit_id" INT,
  "analysis_type" VARCHAR(255) NOT NULL,
  "result" VARCHAR(255) NOT NULL,
  "analysis_date" DATE NOT NULL,
  "observations" TEXT
);

CREATE TABLE "transfusions" (
  "ID_Transfusion" SERIAL PRIMARY KEY,
  "unit_id" INT NOT NULL,
  "staff_transfusion_id" INT,
  "transfusion_date" DATE NOT NULL,
  "receptor_id" INT,
  "observations" TEXT
);

ALTER TABLE "blood_units" ADD FOREIGN KEY ("donor_id") REFERENCES "persons" ("ID_Person");

ALTER TABLE "donation_records_events" ADD FOREIGN KEY ("donor_event_id") REFERENCES "persons" ("ID_Person");

ALTER TABLE "donation_records_events" ADD FOREIGN KEY ("event_id") REFERENCES "donation_events" ("ID_Event");

ALTER TABLE "donation_records_events" ADD FOREIGN KEY ("unit_id") REFERENCES "blood_units" ("ID_Unit");

ALTER TABLE "analysis_results" ADD FOREIGN KEY ("unit_id") REFERENCES "blood_units" ("ID_Unit");

ALTER TABLE "transfusions" ADD FOREIGN KEY ("unit_id") REFERENCES "blood_units" ("ID_Unit");

ALTER TABLE "event_responsible_persons" ADD FOREIGN KEY ("staff_event_id") REFERENCES "persons" ("ID_Person");

ALTER TABLE "event_responsible_persons" ADD FOREIGN KEY ("event_id") REFERENCES "donation_events" ("ID_Event");

ALTER TABLE "transfusions" ADD FOREIGN KEY ("staff_transfusion_id") REFERENCES "persons" ("ID_Person");

ALTER TABLE "transfusions" ADD FOREIGN KEY ("receptor_id") REFERENCES "persons" ("ID_Person");