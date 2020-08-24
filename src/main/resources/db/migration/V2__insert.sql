
--
-- Dumping data for table `aircraft`
--
use ftb;

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `aircraft` DISABLE KEYS */;
INSERT INTO `order` VALUES ('FRESH-CUS-001','2020-08-24','i need it urgent'),('FRESH-CUS-002','2020-08-24','i need it late');
/*!40000 ALTER TABLE `aircraft` ENABLE KEYS */;
UNLOCK TABLES;


LOCK TABLES `itemmaster` WRITE;
/*!40000 ALTER TABLE `aircraft` DISABLE KEYS */;
INSERT INTO `order` VALUES (1,'apple','i need it urgent'),(2,'orange','i need it late');
/*!40000 ALTER TABLE `aircraft` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'ROLE_ADMIN'),(2,'ROLE_AGENT');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Dumping data for table `users`
-- password1: password , password2: password

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'varathu09@gmail.com','John','Doe',NULL,'$2a$04$AKH7KONlNCThte32sIO7y.wuLJYovNumMtthBDQy00kOxT27fOvn2','john'),(2,'mike@gmail.com','Mike','Jacson',NULL,'$2a$04$AKH7KONlNCThte32sIO7y.wuLJYovNumMtthBDQy00kOxT27fOvn2','mike');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `users_roles`
--

LOCK TABLES `users_roles` WRITE;
/*!40000 ALTER TABLE `users_roles` DISABLE KEYS */;
INSERT INTO `users_roles` VALUES (1,1),(2,2);
/*!40000 ALTER TABLE `users_roles` ENABLE KEYS */;
UNLOCK TABLES;
