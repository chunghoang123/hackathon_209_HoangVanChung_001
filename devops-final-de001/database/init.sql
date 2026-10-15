CREATE DATABASE IF NOT EXISTS ptit_lab_db;
USE ptit_lab_db;

CREATE TABLE IF NOT EXISTS labs (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    location VARCHAR(100),
    capacity INT,
    status VARCHAR(20)
);
INSERT INTO labs (lab_name, building, capacity, equipment, status) VALUES
                                                                       ('DevOps Lab', 'A1', 40, 'Máy chủ Dell R740, Switch Cisco', 'Hoạt động'),
                                                                       ('Cloud Lab', 'A1', 35, 'Cụm Proxmox 3 node', 'Hoạt động'),
                                                                       ('Network Lab', 'A2', 30, 'Router Cisco 4321', 'Bảo trì'),
                                                                       ('AI Lab', 'A3', 25, 'GPU NVIDIA RTX 4090', 'Hoạt động'),
                                                                       ('IoT Lab', 'A2', 30, 'Raspberry Pi, Arduino', 'Hoạt động'),
                                                                       ('Security Lab', 'A3', 20, 'Firewall FortiGate 60F', 'Tạm đóng'),
                                                                       ('Mobile Lab', 'B1', 45, 'MacBook Pro, iPhone 15', 'Hoạt động'),
                                                                       ('Data Lab', 'B1', 40, 'Máy trạm HP Z4', 'Hoạt động');
