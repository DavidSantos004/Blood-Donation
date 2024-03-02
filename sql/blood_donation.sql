CREATE TABLE persons (
  ID_Person SERIAL PRIMARY KEY,
  First_Name VARCHAR(255) NOT NULL,
  Last_Name VARCHAR(255) NOT NULL,
  Dni VARCHAR(255) UNIQUE NOT NULL,
  User_Type VARCHAR(20) NOT NULL,
  Blood_Group VARCHAR(5),
  Rh_Factor VARCHAR(1),
  Birthdate DATE,
  Address VARCHAR(255),
  Phone VARCHAR(20) UNIQUE,
  Email VARCHAR(255) UNIQUE,
  Last_Donation DATE,
  Role VARCHAR(50)
);

CREATE TABLE blood_units (
  ID_Unit SERIAL PRIMARY KEY,
  Donor_ID INT,
  Blood_Type VARCHAR(5) NOT NULL,
  Rh_Factor VARCHAR(1) NOT NULL,
  Donation_Date DATE NOT NULL,
  Status VARCHAR(50) NOT NULL,
  Volume_Content NUMERIC
);

CREATE TABLE donation_events (
  ID_Event SERIAL PRIMARY KEY,
  Event_Date DATE,
  City VARCHAR(255),
  Address VARCHAR(255),
  Description TEXT,
  Status VARCHAR(255)
);

CREATE TABLE donation_records_events (
  ID_Donation SERIAL PRIMARY KEY,
  Person_ID INT,
  Event_ID INT,
  Unit_ID INT
);

CREATE TABLE event_responsible_persons (
  ID_Event_Responsible_Person SERIAL PRIMARY KEY,
  Person_ID INT,
  Event_ID INT
);

CREATE TABLE analysis_results (
  ID_Result SERIAL PRIMARY KEY,
  Unit_ID INT,
  Analysis_Type VARCHAR(255) NOT NULL,
  Result VARCHAR(255) NOT NULL,
  Analysis_Date DATE NOT NULL,
  Observations TEXT
);

CREATE TABLE transfusions (
  ID_Transfusion SERIAL PRIMARY KEY,
  Unit_ID INT NOT NULL,
  Person_ID INT,
  Transfusion_Date DATE NOT NULL,
  Recipient_ID INT,
  Observations TEXT
);

ALTER TABLE blood_units ADD FOREIGN KEY (Donor_ID) REFERENCES persons (ID_Person);

ALTER TABLE donation_records_events ADD FOREIGN KEY (Person_ID) REFERENCES persons (ID_Person);

ALTER TABLE donation_records_events ADD FOREIGN KEY (Event_ID) REFERENCES donation_events (ID_Event);

ALTER TABLE donation_records_events ADD FOREIGN KEY (Unit_ID) REFERENCES blood_units (ID_Unit);

ALTER TABLE analysis_results ADD FOREIGN KEY (Unit_ID) REFERENCES blood_units (ID_Unit);

ALTER TABLE transfusions ADD FOREIGN KEY (Unit_ID) REFERENCES blood_units (ID_Unit);

ALTER TABLE event_responsible_persons ADD FOREIGN KEY (Person_ID) REFERENCES persons (ID_Person);

ALTER TABLE event_responsible_persons ADD FOREIGN KEY (Event_ID) REFERENCES donation_events (ID_Event);

ALTER TABLE transfusions ADD FOREIGN KEY (Person_ID) REFERENCES persons (ID_Person);

ALTER TABLE transfusions ADD FOREIGN KEY (Recipient_ID) REFERENCES persons (ID_Person);