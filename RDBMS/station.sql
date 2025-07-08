-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: mjc813_db
-- ------------------------------------------------------
-- Server version	8.4.5

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `train_tbl`
--

DROP TABLE IF EXISTS `train_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `train_tbl` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '기본키 자동증가',
  `name` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '기차이름',
  `qty` int NOT NULL COMMENT '기차의 차량수',
  `seat_count` int NOT NULL COMMENT '기차의 의자수',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `train_tbl`
--

LOCK TABLES `train_tbl` WRITE;
/*!40000 ALTER TABLE `train_tbl` DISABLE KEYS */;
INSERT INTO `train_tbl` VALUES (1,'무궁화1호',12,1180);
INSERT INTO `train_tbl` VALUES (2,'무궁화2호',13,1290);
INSERT INTO `train_tbl` VALUES (3,'새마을1호',11,1010);
INSERT INTO `train_tbl` VALUES (4,'KTX1호',10,990);
INSERT INTO `train_tbl` VALUES (5,'KTX2호',11,1050);
INSERT INTO `train_tbl` VALUES (6,'새마을2호',12,1150);
INSERT INTO `train_tbl` VALUES (7,'ITX1호',6,590);
INSERT INTO `train_tbl` VALUES (8,'ITX2호',7,640);
INSERT INTO `train_tbl` VALUES (9,'비둘기1호',14,1330);
INSERT INTO `train_tbl` VALUES (10,'비둘기2호',13,1260);
/*!40000 ALTER TABLE `train_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `train_way_tbl`
--

DROP TABLE IF EXISTS `train_way_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `train_way_tbl` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '기본키 자동증가',
  `name` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '노선이름',
  `train_id` int unsigned DEFAULT NULL,
  `start_station_id` int unsigned DEFAULT NULL,
  `end_station_id` int unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `train_way_fk_train` (`train_id`),
  KEY `train_way_fk_start` (`start_station_id`),
  KEY `train_way_fk_end` (`end_station_id`),
  CONSTRAINT `train_way_fk_end` FOREIGN KEY (`end_station_id`) REFERENCES `station_tbl` (`id`),
  CONSTRAINT `train_way_fk_start` FOREIGN KEY (`start_station_id`) REFERENCES `station_tbl` (`id`),
  CONSTRAINT `train_way_fk_train` FOREIGN KEY (`train_id`) REFERENCES `train_tbl` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `train_way_tbl`
--

LOCK TABLES `train_way_tbl` WRITE;
/*!40000 ALTER TABLE `train_way_tbl` DISABLE KEYS */;
INSERT INTO `train_way_tbl` VALUES (1,'여름여행길',9,1,2);
INSERT INTO `train_way_tbl` VALUES (2,'바다여행길',10,9,3);
INSERT INTO `train_way_tbl` VALUES (3,'출퇴근급행',4,6,1);
INSERT INTO `train_way_tbl` VALUES (4,'출퇴근서행',3,5,1);
/*!40000 ALTER TABLE `train_way_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `station_tbl`
--

DROP TABLE IF EXISTS `station_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `station_tbl` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '기본키 자동증가',
  `name` varchar(20) COLLATE utf8mb4_general_ci NOT NULL COMMENT '역이름',
  `lat` decimal(12,8) DEFAULT NULL COMMENT '위도',
  `lng` decimal(12,8) DEFAULT NULL COMMENT '경도',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `station_tbl`
--

LOCK TABLES `station_tbl` WRITE;
/*!40000 ALTER TABLE `station_tbl` DISABLE KEYS */;
INSERT INTO `station_tbl` VALUES (1,'서울',38.66222000,127.54656000);
INSERT INTO `station_tbl` VALUES (2,'춘천',38.43455000,127.33444000);
INSERT INTO `station_tbl` VALUES (3,'부산',38.65454000,127.12321000);
INSERT INTO `station_tbl` VALUES (4,'광주',38.76554000,127.75444000);
INSERT INTO `station_tbl` VALUES (5,'대전',38.33331000,127.12322000);
INSERT INTO `station_tbl` VALUES (6,'인천',38.74444000,127.32432000);
INSERT INTO `station_tbl` VALUES (7,'대구',38.54643000,127.34555000);
INSERT INTO `station_tbl` VALUES (8,'목포',38.24322000,127.34433000);
INSERT INTO `station_tbl` VALUES (9,'강릉',38.75443000,127.45442000);
/*!40000 ALTER TABLE `station_tbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-07-08 12:42:34

----------------------------------------------------------------------