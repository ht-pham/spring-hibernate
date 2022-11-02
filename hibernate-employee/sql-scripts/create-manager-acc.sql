CREATE USER 'hrmanager'@'localhost' IDENTIFIED BY 'hrmanager';
GRANT ALL PRIVILEGES ON hb_employee_tracker.* TO 'hrmanager'@'localhost';

ALTER USER 'hrmanager'@'localhost' IDENTIFIED WITH mysql_native_password BY 'hrmanager1';