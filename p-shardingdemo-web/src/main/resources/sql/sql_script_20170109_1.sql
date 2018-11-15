ALTER TABLE `tx_order`.`tx_order` ADD COLUMN `return_visit_status` INT(11) DEFAULT NULL;
ALTER TABLE `tx_order`.`tx_order` modify COLUMN `return_visit_status` INT(11) DEFAULT 1 comment '回访状态';
update `tx_order`.`tx_order`  set return_visit_status = 1;
