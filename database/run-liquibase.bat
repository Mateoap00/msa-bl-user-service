@echo off
REM Exportar variables de entorno
set DATABASE_USERNAME=user
set DATABASE_PASSWORD=12345
set DATABASE_URL=jdbc:postgresql://localhost:5432/local_db?currentSchema=public
set LOG_LEVEL=-info

REM Ejecutar Liquibase
cd database

liquibase ^
  --classpath=lib\postgresql-42.7.8.jar ^
  --driver=org.postgresql.Driver ^
  --changeLogFile=changelog-master.yaml ^
  --url=%DATABASE_URL% ^
  --username=%DATABASE_USERNAME% ^
  --password=%DATABASE_PASSWORD% ^
  --logLevel=%LOG_LEVEL% ^
  update