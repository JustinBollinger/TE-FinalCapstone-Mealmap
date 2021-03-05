#!/bin/bash
BASEDIR=$(dirname $0)
DATABASE=final_capstone
export PGPASSWORD='postgres1'

psql -U postgres -f "$BASEDIR/01_drop_and_create_db.sql" &&
psql -U postgres -d $DATABASE -f "$BASEDIR/02_create_database_users.sql" &&
psql -U postgres -d $DATABASE -f "$BASEDIR/03_create_table_schema.sql" &&
psql -U postgres -d $DATABASE -f "$BASEDIR/04_insert_seed_data.sql"
