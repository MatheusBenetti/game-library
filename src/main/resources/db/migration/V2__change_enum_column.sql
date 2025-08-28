-- V2__change_enum_column.sql

ALTER TABLE Games DROP COLUMN console;

ALTER TABLE Games ADD COLUMN console VARCHAR(50)[] NOT NULL;

DROP TYPE IF EXISTS console_enum;
