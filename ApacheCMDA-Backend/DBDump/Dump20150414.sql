-- MySQL dump 10.13  Distrib 5.6.19, for osx10.7 (i386)
--
-- Host: einstein.sv.cmu.edu    Database: testdb
-- ------------------------------------------------------
-- Server version	5.6.21-1+deb.sury.org~precise+1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `BookChapterPublication`
--

DROP TABLE IF EXISTS `BookChapterPublication`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BookChapterPublication` (
  `bookName` varchar(255) DEFAULT NULL,
  `editorName` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `bookChapterPublicationId` bigint(20) NOT NULL,
  PRIMARY KEY (`bookChapterPublicationId`),
  CONSTRAINT `FK_rj089cc6q39dtcpqoqiigc0kj` FOREIGN KEY (`bookChapterPublicationId`) REFERENCES `Publication` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BookChapterPublication`
--

LOCK TABLES `BookChapterPublication` WRITE;
/*!40000 ALTER TABLE `BookChapterPublication` DISABLE KEYS */;
/*!40000 ALTER TABLE `BookChapterPublication` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `BookPublication`
--

DROP TABLE IF EXISTS `BookPublication`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BookPublication` (
  `bookName` varchar(255) DEFAULT NULL,
  `pages` varchar(255) DEFAULT NULL,
  `publisherLocation` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `bookPublicationId` bigint(20) NOT NULL,
  PRIMARY KEY (`bookPublicationId`),
  CONSTRAINT `FK_j0cs5jfi3kkw7r8a01gf02q8x` FOREIGN KEY (`bookPublicationId`) REFERENCES `Publication` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BookPublication`
--

LOCK TABLES `BookPublication` WRITE;
/*!40000 ALTER TABLE `BookPublication` DISABLE KEYS */;
/*!40000 ALTER TABLE `BookPublication` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `BugReport`
--

DROP TABLE IF EXISTS `BugReport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BugReport` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `creationDate` datetime DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `organization` varchar(255) DEFAULT NULL,
  `solved` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BugReport`
--

LOCK TABLES `BugReport` WRITE;
/*!40000 ALTER TABLE `BugReport` DISABLE KEYS */;
/*!40000 ALTER TABLE `BugReport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ClimateService`
--

DROP TABLE IF EXISTS `ClimateService`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ClimateService` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `createTime` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `purpose` varchar(255) DEFAULT NULL,
  `rootServiceId` bigint(20) NOT NULL,
  `scenario` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `versionNo` varchar(255) DEFAULT NULL,
  `creatorId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_pthjuwm8mc20t3004lg8q7dmw` (`creatorId`),
  CONSTRAINT `FK_pthjuwm8mc20t3004lg8q7dmw` FOREIGN KEY (`creatorId`) REFERENCES `User` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ClimateService`
--

LOCK TABLES `ClimateService` WRITE;
/*!40000 ALTER TABLE `ClimateService` DISABLE KEYS */;
INSERT INTO `ClimateService` VALUES (1,NULL,'2-D-Variable-Map','This service generates a map of a 2-dimensional variable with time averaging and spatial subsetting.  Select a data source (model or observation), a variable name, a time range, and a spatial range (lat-lon box) below...',2,'12','http://einstein.sv.cmu.edu:9003/cmac/web/twoDimMap.html','1',1),(2,NULL,'2-D-Variable-Zonal-Mean','This service generates a graph of a 2-dimensional variable\'s zonal mean with time averaing.  Select a data source (model or observation), a variable name, and a time range below.',2,'13','http://einstein.sv.cmu.edu:9003/cmac/web/twoDimZonalMean.html','1',1),(3,NULL,'2-D-Variable-Time-Series','This service generates a graph of a 2-dimensional variable\'s time series with monthly averaged values.  Select a data source (model or observation), a variable name, a time range, and a spatial range below.',103,'1','http://einstein.sv.cmu.edu:9003/cmac/web/twoDimTimeSeries.html','1',1),(4,NULL,'3-D-Variable-2-D-Slice','This service generates a slice map of a 3-dimensional variable at a selected pressure level.  Select a data source, a variable name, a time range, a spatial range, and a pressure level below.',2,'1','http://einstein.sv.cmu.edu:9003/cmac/web/twoDimSlice3D.html','1',1),(5,NULL,'3-D-Variable-Zonal-Mean','This service generates a contour plot of zonal-mean vertical profiles of a 3-dimensional variable.  Select a data source, a variable name, a time range, and a pressure range below.',105,'2','http://einstein.sv.cmu.edu:9003/cmac/web/threeDimZonalMean.html','1',1),(6,NULL,'3-D-Variable-Average-Vertical-4Profile','This service generates the average of a three-dimensional variable over a specified region and time and display the average as a function of pressure level as an X-Y plot. ',11,'1','http://einstein.sv.cmu.edu:9003/cmac/web/threeDimVarVertical.html','1',1),(7,NULL,'Scatter-and-Histogram-Plot-of-Two-Variables','This service generates a scatter plot between two specified variables and the histograms of the two variables, and calculates the correlation of the two variables.Edit',29,'12','http://einstein.sv.cmu.edu:9003/cmac/web/scatterPlot2Vars.html','1',1),(8,NULL,'Difference-Plot-of-Two-Time-Averaged-Variables','This service calculates the differences between two specified variables and displays the lat-lon maps of the two variables and their differences.',232,'12','http://einstein.sv.cmu.edu:9003/cmac/web/diffPlot2Vars.html','1',1),(9,NULL,'Conditional-Sampling','This service sorts one variable by the values of another variable (environmental condition, e.g. SST) and displays the averaged value of the first variable as a function of the bin value of the second variable.',26,'1','http://einstein.sv.cmu.edu:9003/cmac/web/conditionalSampling.html','1',1);
/*!40000 ALTER TABLE `ClimateService` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ConferencePublication`
--

DROP TABLE IF EXISTS `ConferencePublication`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ConferencePublication` (
  `location` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `page` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `conferencePublicationId` bigint(20) NOT NULL,
  PRIMARY KEY (`conferencePublicationId`),
  CONSTRAINT `FK_1xj6wfj26ppyu92ygnk3cdj6n` FOREIGN KEY (`conferencePublicationId`) REFERENCES `Publication` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ConferencePublication`
--

LOCK TABLES `ConferencePublication` WRITE;
/*!40000 ALTER TABLE `ConferencePublication` DISABLE KEYS */;
/*!40000 ALTER TABLE `ConferencePublication` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Dataset`
--

DROP TABLE IF EXISTS `Dataset`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Dataset` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `CMIP5VarName` varchar(255) DEFAULT NULL,
  `agencyId` varchar(255) DEFAULT NULL,
  `dataSourceInputParameterToCallScienceApplicationCode` varchar(255) DEFAULT NULL,
  `gridDimension` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `physicalVariable` varchar(255) DEFAULT NULL,
  `publishTimeStamp` datetime DEFAULT NULL,
  `responsiblePerson` varchar(255) DEFAULT NULL,
  `source` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `units` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `variableNameInWebInterface` varchar(255) DEFAULT NULL,
  `variableNameInputParameterToCallScienceApplicationCode` varchar(255) DEFAULT NULL,
  `instrumentId` bigint(20) NOT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `dataSourceNameinWebInterface` varchar(255) DEFAULT NULL,
  `startTime` datetime DEFAULT NULL,
  `endTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_9x29nf004vryd28iummv5l5r0` (`instrumentId`),
  CONSTRAINT `FK_9x29nf004vryd28iummv5l5r0` FOREIGN KEY (`instrumentId`) REFERENCES `Instrument` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Dataset`
--

LOCK TABLES `Dataset` WRITE;
/*!40000 ALTER TABLE `Dataset` DISABLE KEYS */;
INSERT INTO `Dataset` VALUES (1,'ot','NOAA','NOAA_ARGO','3D','ARGO Ocean Temperature','Ocean temperature','2015-04-07 21:30:02','BT/CZ/GS/SL','ARGO','available on server','K',NULL,'Ocean temperature','ot',1,NULL,'NOAA/ARGO',null, null);
/*!40000 ALTER TABLE `Dataset` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DatasetAndService`
--

DROP TABLE IF EXISTS `DatasetAndService`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DatasetAndService` (
  `datasetId` bigint(20) NOT NULL,
  `climateServiceId` bigint(20) NOT NULL,
  KEY `FK_6p60kv2w7e024lsmb1t62ig3t` (`climateServiceId`),
  KEY `FK_kun7pek776x1b9auplo9wqpft` (`datasetId`),
  CONSTRAINT `FK_6p60kv2w7e024lsmb1t62ig3t` FOREIGN KEY (`climateServiceId`) REFERENCES `ClimateService` (`id`),
  CONSTRAINT `FK_kun7pek776x1b9auplo9wqpft` FOREIGN KEY (`datasetId`) REFERENCES `Dataset` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DatasetAndService`
--

LOCK TABLES `DatasetAndService` WRITE;
/*!40000 ALTER TABLE `DatasetAndService` DISABLE KEYS */;
/*!40000 ALTER TABLE `DatasetAndService` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DatasetLog`
--

DROP TABLE IF EXISTS `DatasetLog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DatasetLog` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `plotUrl` varchar(255) DEFAULT NULL,
  `serviceExecutionLog` varchar(255) DEFAULT NULL,
  `instrumentId` bigint(20) NOT NULL,
  `originalDataSetId` bigint(20) NOT NULL,
  `outputDataSetId` bigint(20) NOT NULL,
  `dataUrl` varchar(255) DEFAULT NULL,
  `dataSetId` bigint(20) NOT NULL,
  `serviceExecutionLogId` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_94re6mmagml0joq8obi5j3tnp` (`instrumentId`),
  KEY `FK_o19ihe0nm8mbtcc48gr9hi6pv` (`originalDataSetId`),
  KEY `FK_nqntvi90gyn1roc6s6xkq3w6h` (`outputDataSetId`),
  KEY `FK_8qcp27u950bwk18esghybcm6y` (`dataSetId`),
  KEY `FK_kecu7ieo2f0q07l5t8bf5dwjr` (`serviceExecutionLogId`),
  CONSTRAINT `FK_8qcp27u950bwk18esghybcm6y` FOREIGN KEY (`dataSetId`) REFERENCES `Dataset` (`id`),
  CONSTRAINT `FK_94re6mmagml0joq8obi5j3tnp` FOREIGN KEY (`instrumentId`) REFERENCES `Instrument` (`id`),
  CONSTRAINT `FK_kecu7ieo2f0q07l5t8bf5dwjr` FOREIGN KEY (`serviceExecutionLogId`) REFERENCES `ServiceExecutionLog` (`id`),
  CONSTRAINT `FK_nqntvi90gyn1roc6s6xkq3w6h` FOREIGN KEY (`outputDataSetId`) REFERENCES `Dataset` (`id`),
  CONSTRAINT `FK_o19ihe0nm8mbtcc48gr9hi6pv` FOREIGN KEY (`originalDataSetId`) REFERENCES `Dataset` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DatasetLog`
--

LOCK TABLES `DatasetLog` WRITE;
/*!40000 ALTER TABLE `DatasetLog` DISABLE KEYS */;
/*!40000 ALTER TABLE `DatasetLog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Instrument`
--

DROP TABLE IF EXISTS `Instrument`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Instrument` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `launchDate` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Instrument`
--

LOCK TABLES `Instrument` WRITE;
/*!40000 ALTER TABLE `Instrument` DISABLE KEYS */;
INSERT INTO `Instrument` VALUES (1,NULL,NULL,'ARGO'),(2,NULL,NULL,'GRACE'),(3,NULL,NULL,'NODC'),(4,NULL,NULL,'AIRS'),(5,NULL,NULL,'MLS'),(6,NULL,NULL,'MODIS'),(7,NULL,NULL,'TRMM'),(8,NULL,NULL,'GPCP'),(9,NULL,NULL,'AMSRE'),(10,NULL,NULL,'QuikSCAT'),(11,NULL,NULL,'AVISO'),(12,NULL,NULL,'CERES');
/*!40000 ALTER TABLE `Instrument` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `JournalPublication`
--

DROP TABLE IF EXISTS `JournalPublication`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `JournalPublication` (
  `journalName` varchar(255) DEFAULT NULL,
  `page` varchar(255) DEFAULT NULL,
  `qcolumn` int(11) NOT NULL,
  `volume` int(11) NOT NULL,
  `journalPublicationId` bigint(20) NOT NULL,
  PRIMARY KEY (`journalPublicationId`),
  CONSTRAINT `FK_gkgd1iw2a062mp2xmbg0ih0he` FOREIGN KEY (`journalPublicationId`) REFERENCES `Publication` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `JournalPublication`
--

LOCK TABLES `JournalPublication` WRITE;
/*!40000 ALTER TABLE `JournalPublication` DISABLE KEYS */;
/*!40000 ALTER TABLE `JournalPublication` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Parameter`
--

DROP TABLE IF EXISTS `Parameter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Parameter` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dataRange` varchar(255) DEFAULT NULL,
  `indexInService` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `purpose` varchar(255) DEFAULT NULL,
  `rule` varchar(255) DEFAULT NULL,
  `serviceId` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_2dy806x79j22t7i4rbdpeldof` (`serviceId`),
  CONSTRAINT `FK_2dy806x79j22t7i4rbdpeldof` FOREIGN KEY (`serviceId`) REFERENCES `ClimateService` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Parameter`
--

LOCK TABLES `Parameter` WRITE;
/*!40000 ALTER TABLE `Parameter` DISABLE KEYS */;
INSERT INTO `Parameter` VALUES (1,'NORANGE',1,'model','data source','rule',2),(2,'NORANGE',2,'var','variable name','rule',2),(3,'NORANGE',3,'startT','start year-month','rule',2),(4,'NORANGE',4,'endT','end year-month','rule',2),(5,'NORANGE',5,'months','select months','rule',2),(6,'NORANGE',6,'lat1','start lat (deg)','rule',2),(7,'NORANGE',7,'lat2','end lat (deg)','rule',2),(8,'NORANGE',8,'scale','variable scale','rule',2),(9,'norange',1,'model','model','rule',1),(10,'norange',2,'var','var','rule',1),(11,'norange',3,'startT','startT','rule',1),(12,'norange',4,'endT','endT','rule',1),(13,'norange',5,'months','months','rule',1),(14,'norange',6,'lat1','lat1','rule',1),(15,'norange',7,'lat2','lat2','rule',1),(16,'norange',8,'lon1','lon1','rule',1),(17,'norange',9,'lon2','lon2','rule',1),(18,'norange',10,'scale','scale','rule',1),(19,'NORANGE',1,'model','model','rule',3),(20,'NORANGE',2,'var','var','rule',3),(21,'NORANGE',3,'startT','startT','rule',3),(22,'NORANGE',4,'endT','endT','rule',3),(23,'NORANGE',5,'lon1','lon1','rule',3),(24,'NORANGE',6,'lon2','lon2','rule',3),(25,'NORANGE',7,'lat1','lat1','rule',3),(26,'NORANGE',8,'lat2','lat2','rule',3),(27,'NORANGE',9,'scale','scale','rule',3),(28,'NORANGE',1,'model','model','rule',4),(29,'NORANGE',2,'var','var','rule',4),(30,'NORANGE',3,'startT','startT','rule',4),(31,'NORANGE',4,'endT','endT','rule',4),(32,'NORANGE',5,'pr','pr','rule',4),(33,'NORANGE',6,'lon1','lon1','rule',4),(34,'NORANGE',7,'lon2','lon2','rule',4),(35,'NORANGE',8,'lat1','lat1','rule',4),(36,'NORANGE',9,'lat2','lat2','rule',4),(37,'NORANGE',10,'months','months','rule',4),(38,'NORANGE',11,'scale','scale','rule',4),(39,'NORANGE',1,'model','model','rule',5),(40,'NORANGE',2,'var','var','rule',5),(41,'NORANGE',3,'startT','startT','rule',5),(42,'NORANGE',4,'endT','endT','rule',5),(43,'NORANGE',5,'lat1','lat1','rule',5),(44,'NORANGE',6,'lat2','lat2','rule',5),(45,'NORANGE',7,'pres1','pres1','rule',5),(46,'NORANGE',8,'pres2','pres2','rule',5),(47,'NORANGE',9,'months','months','rule',5),(48,'NORANGE',10,'scale','scale','rule',5),(49,'NORANGE',1,'model','model','rule',6),(50,'NORANGE',2,'var','var','rule',6),(51,'NORANGE',3,'startT','startT','rule',6),(52,'NORANGE',4,'endT','endT','rule',6),(53,'NORANGE',5,'lon1','lon1','rule',6),(54,'NORANGE',6,'lon2','lon2','rule',6),(55,'NORANGE',7,'lat1','lat1','rule',6),(56,'NORANGE',8,'lat2','lat2','rule',6),(57,'NORANGE',9,'months','months','rule',6),(58,'NORANGE',10,'scale','scale','rule',6),(59,'NORANGE',1,'model1','model1','rule',7),(60,'NORANGE',2,'model2','model2','rule',7),(61,'NORANGE',3,'var1','var1','rule',7),(62,'NORANGE',4,'var2','var2','rule',7),(63,'NORANGE',5,'pres1','pre1','rule',7),(64,'NORANGE',6,'pres2','pre2','rule',7),(65,'NORANGE',7,'startT','startT','rule',7),(66,'NORANGE',8,'endT','endT','rule',7),(67,'NORANGE',9,'lon1','lon1','rule',7),(68,'NORANGE',10,'lon2','lon2','rule',7),(69,'NORANGE',11,'lat1','lat1','rule',7),(70,'NORANGE',12,'lat2','lat2','rule',7),(71,'NORANGE',13,'nSample','nSample','rule',7),(72,'NORANGE',1,'model1','model1','rule',8),(73,'NORANGE',2,'model2','model2','rule',8),(74,'NORANGE',3,'var1','var1','rule',8),(75,'NORANGE',4,'var2','var2','rule',8),(76,'NORANGE',5,'pres1','pre1','rule',8),(77,'NORANGE',6,'pres2','pre2','rule',8),(78,'NORANGE',7,'startT','startT','rule',8),(79,'NORANGE',8,'endT','endT','rule',8),(80,'NORANGE',9,'lon1','lon1','rule',8),(81,'NORANGE',10,'lon2','lon2','rule',8),(82,'NORANGE',11,'lat1','lat1','rule',8),(83,'NORANGE',12,'lat2','lat2','rule',8),(84,'NORANGE',1,'model1','model1','rule',9),(85,'NORANGE',2,'model2','model2','rule',9),(86,'NORANGE',3,'var1','var1','rule',9),(87,'NORANGE',4,'var2','var2','rule',9),(88,'NORANGE',5,'pres1','pre1','rule',9),(89,'NORANGE',6,'pres2','pre2','rule',9),(90,'NORANGE',7,'startT','startT','rule',9),(91,'NORANGE',8,'endT','endT','rule',9),(92,'NORANGE',9,'lon1','lon1','rule',9),(93,'NORANGE',10,'lon2','lon2','rule',9),(94,'NORANGE',11,'lat1','lat1','rule',9),(95,'NORANGE',12,'lat2','lat2','rule',9),(96,'NORANGE',13,'months','months','rule',9),(97,'NORANGE',14,'bin_min','bin_min','rule',9),(98,'NORANGE',15,'bin_max','bin_max','rule',9),(99,'NORANGE',16,'bin_n','bin_n','rule',9),(100,'NORANGE',17,'env_var_plev','env_var_plev','rule',9),(101,'NORANGE',18,'displayOpt','displayOpt','rule',9);
/*!40000 ALTER TABLE `Parameter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Publication`
--

DROP TABLE IF EXISTS `Publication`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Publication` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `paperTitle` varchar(255) DEFAULT NULL,
  `publicationChannel` varchar(255) DEFAULT NULL,
  `year` int(11) NOT NULL,
  `authorId` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_acs1ekskulb7pdx2w7uepfr06` (`authorId`),
  CONSTRAINT `FK_acs1ekskulb7pdx2w7uepfr06` FOREIGN KEY (`authorId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Publication`
--

LOCK TABLES `Publication` WRITE;
/*!40000 ALTER TABLE `Publication` DISABLE KEYS */;
/*!40000 ALTER TABLE `Publication` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ServiceConfiguration`
--

DROP TABLE IF EXISTS `ServiceConfiguration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ServiceConfiguration` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `runTime` varchar(255) DEFAULT NULL,
  `serviceId` bigint(20) NOT NULL,
  `userId` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_g87gq4j46v8sr3h1lo6aj2ddb` (`serviceId`),
  KEY `FK_l4ppwornf1qqg7pbq6xo29pg8` (`userId`),
  CONSTRAINT `FK_g87gq4j46v8sr3h1lo6aj2ddb` FOREIGN KEY (`serviceId`) REFERENCES `ClimateService` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `FK_l4ppwornf1qqg7pbq6xo29pg8` FOREIGN KEY (`userId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=321 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ServiceConfiguration`
--

LOCK TABLES `ServiceConfiguration` WRITE;
/*!40000 ALTER TABLE `ServiceConfiguration` DISABLE KEYS */;
INSERT INTO `ServiceConfiguration` VALUES (1,'10s',7,1),(2,'10s',7,1),(3,'10s',7,1),(4,'10s',7,1),(5,'10s',7,1),(6,'10s',7,1),(7,'10s',7,1),(8,'10s',7,1),(9,'10s',7,1),(10,'10s',7,1),(11,'10s',7,1),(12,'10s',7,1),(13,'10s',7,1),(14,'10s',7,1),(15,'10s',3,1),(16,'10s',3,1),(17,'10s',3,1),(18,'10s',3,1),(19,'10s',3,1),(20,'10s',1,1),(21,'10s',1,1),(22,'10s',7,1),(23,'10s',7,1),(24,'10s',7,1),(25,'10s',7,1),(26,'10s',7,1),(27,'10s',7,1),(28,'10s',1,1),(29,'10s',1,1),(30,'10s',1,1),(31,'10s',1,1),(32,'10s',1,1),(33,'10s',1,1),(34,'10s',1,1),(35,'10s',1,1),(36,'10s',1,1),(37,'10s',1,1),(38,'10s',1,1),(39,'10s',1,1),(40,'10s',1,1),(41,'10s',1,1),(42,'10s',7,1),(43,'10s',7,1),(44,'10s',7,1),(45,'10s',7,1),(46,'10s',7,1),(47,'10s',7,1),(48,'10s',7,1),(49,'10s',3,1),(50,'10s',3,1),(51,'10s',3,1),(52,'10s',3,1),(53,'10s',3,1),(54,'10s',3,1),(55,'10s',2,1),(56,'10s',2,1),(57,'10s',2,1),(58,'10s',8,1),(59,'10s',8,1),(60,'10s',1,1),(61,'10s',7,1),(62,'10s',7,1),(63,'10s',1,1),(64,'10s',1,1),(65,'10s',8,1),(66,'10s',1,1),(67,'10s',3,1),(68,'10s',3,1),(69,'10s',1,1),(70,'10s',1,1),(71,'10s',1,1),(72,'10s',1,1),(73,'10s',1,1),(74,'10s',1,1),(75,'10s',1,1),(76,'10s',1,1),(77,'10s',1,1),(78,'10s',1,1),(79,'10s',2,1),(81,'10s',1,1),(82,'10s',7,1),(84,'10s',1,1),(85,'10s',5,1),(86,'10s',1,1),(87,'10s',7,1),(88,'10s',1,1),(89,'10s',1,1),(90,'10s',1,1),(91,'10s',1,1),(95,'10s',5,1),(96,'10s',1,1),(97,'10s',7,1),(98,'10s',7,1),(99,'10s',7,1),(101,'10s',7,1),(102,'10s',7,1),(103,'10s',7,1),(105,'10s',7,1),(106,'10s',7,1),(107,'10s',7,1),(108,'10s',7,1),(109,'10s',7,1),(110,'10s',7,1),(111,'10s',7,1),(112,'10s',7,1),(113,'10s',7,1),(114,'10s',7,1),(115,'10s',7,1),(116,'10s',7,1),(118,'10s',1,1),(119,'10s',2,1),(120,'10s',3,1),(121,'10s',4,1),(122,'10s',1,1),(123,'10s',1,1),(124,'10s',1,1),(125,'10s',7,1),(126,'10s',7,1),(127,'10s',7,1),(128,'10s',7,1),(129,'10s',2,1),(130,'10s',7,1),(131,'10s',7,1),(132,'10s',6,1),(133,'10s',6,1),(134,'10s',6,1),(135,'10s',5,1),(136,'10s',5,1),(137,'10s',5,1),(138,'10s',5,1),(139,'10s',5,1),(140,'10s',5,1),(141,'10s',5,1),(142,'10s',7,1),(143,'10s',7,1),(144,'10s',1,1),(145,'10s',1,1),(146,'10s',2,1),(147,'10s',2,1),(148,'10s',2,1),(149,'10s',2,1),(150,'10s',1,1),(151,'10s',1,1),(152,'10s',1,1),(153,'10s',1,1),(154,'10s',1,1),(155,'10s',1,1),(156,'10s',2,1),(157,'10s',2,1),(158,'10s',2,1),(159,'10s',2,1),(160,'10s',2,1),(161,'10s',2,1),(162,'10s',2,1),(163,'10s',2,1),(164,'10s',2,1),(165,'10s',7,1),(166,'10s',2,1),(167,'10s',2,1),(168,'10s',4,1),(169,'10s',6,1),(170,'10s',6,1),(171,'10s',7,1),(172,'10s',7,1),(173,'10s',1,1),(174,'10s',1,1),(175,'10s',1,1),(176,'10s',1,1),(177,'10s',1,1),(178,'10s',1,1),(179,'10s',1,1),(180,'10s',1,1),(181,'10s',1,1),(182,'10s',1,1),(183,'10s',1,1),(184,'10s',1,1),(185,'10s',1,1),(186,'10s',1,1),(187,'10s',4,1),(188,'2000ms',1,1),(189,'0ms',1,1),(190,'2000ms',7,1),(191,'2000ms',3,1),(192,'2000ms',1,1),(193,'3000ms',4,1),(194,'3000ms',6,1),(195,'4000ms',8,1),(196,'2000ms',3,1),(197,'2000ms',3,1),(198,'2000ms',3,1),(199,'2000ms',1,1),(200,'2000ms',1,1),(201,'2000ms',1,1),(202,'2000ms',1,1),(203,'2000ms',1,1),(204,'2000ms',3,1),(205,'3000ms',4,1),(206,'3000ms',6,1),(207,'2000ms',7,1),(208,'4000ms',8,1),(209,'1000ms',9,1),(210,'2000ms',2,1),(211,'2000ms',1,1),(212,'3000ms',1,1),(213,'2000ms',1,1),(214,'2000ms',1,1),(215,'2000ms',2,1),(216,'3000ms',5,1),(217,'3000ms',5,1),(218,'3000ms',5,1),(219,'2000ms',2,1),(220,'2000ms',1,1),(221,'2000ms',2,1),(222,'2000ms',1,1),(223,'1000ms',2,1),(224,'0ms',1,1),(225,'1000ms',3,1),(226,'3000ms',4,1),(227,'3000ms',5,1),(228,'3000ms',6,1),(229,'3000ms',7,1),(230,'3000ms',8,1),(231,'1000ms',9,1),(232,'1000ms',2,1),(233,'1000ms',2,1),(235,'1000ms',3,1),(236,'3000ms',4,1),(237,'3000ms',5,1),(238,'3000ms',5,1),(239,'4000ms',5,1),(240,'3000ms',5,1),(241,'3000ms',1,1),(242,'2000ms',1,1),(243,'2000ms',3,1),(244,'3000ms',4,1),(245,'3000ms',4,1),(246,'2000ms',6,1),(247,'2000ms',7,1),(248,'2000ms',7,1),(249,'3000ms',8,1),(250,'2000ms',9,1),(251,'2000ms',9,1),(252,'3000ms',8,1),(253,'2000ms',9,1),(254,'2000ms',7,1),(255,'3000ms',1,1),(256,'2000ms',1,1),(257,'2000ms',1,1),(258,'2000ms',1,1),(259,'2000ms',3,1),(260,'3000ms',5,1),(262,'2000ms',7,1),(263,'2000ms',7,1),(264,'2000ms',1,1),(265,'2000ms',1,1),(266,'2000ms',1,1),(267,'2000ms',2,1),(268,'2000ms',2,1),(269,'1000ms',3,1),(270,'2000ms',3,1),(271,'3000ms',4,1),(272,'3000ms',4,1),(273,'2000ms',2,1),(274,'1000ms',4,1),(275,'3000ms',4,1),(276,'2000ms',2,1),(277,'2000ms',2,1),(278,'3000ms',6,1),(279,'3000ms',6,1),(280,'2000ms',7,1),(281,'0ms',7,1),(282,'1000ms',7,1),(283,'1000ms',7,1),(284,'1000ms',7,1),(285,'3000ms',4,1),(286,'3000ms',4,1),(287,'1000ms',7,1),(288,'2000ms',7,1),(289,'2000ms',7,1),(290,'0ms',7,1),(291,'2000ms',7,1),(292,'3000ms',8,1),(293,'0ms',8,1),(294,'2000ms',9,1),(295,'0ms',9,1),(296,'2000ms',1,1),(297,'2000ms',1,1),(298,'2000ms',7,1),(299,'1000ms',9,1),(300,'0ms',9,1),(301,'1000ms',9,1),(302,'0ms',9,1),(303,'0ms',9,1),(304,'3000ms',1,1),(305,'3000ms',5,1),(306,'3000ms',6,1),(307,'4000ms',8,1),(308,'1000ms',9,1),(309,'2000ms',1,1),(310,'3000ms',8,1),(311,'2000ms',1,1),(312,'2000ms',1,1),(313,'3000ms',1,1),(314,'2000ms',1,1),(315,'0ms',9,1),(316,'0ms',9,1),(317,'2000ms',9,1),(318,'1000ms',8,1),(319,'2000ms',9,1),(320,'0ms',9,1);
/*!40000 ALTER TABLE `ServiceConfiguration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ServiceConfigurationItem`
--

DROP TABLE IF EXISTS `ServiceConfigurationItem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ServiceConfigurationItem` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `value` varchar(255) DEFAULT NULL,
  `parameterId` bigint(20) NOT NULL,
  `serviceConfigurationId` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_1i79wnmt5pi0msfu7rwpck74g` (`parameterId`),
  KEY `FK_756ht9ilrv623yxt54v7v43if` (`serviceConfigurationId`),
  CONSTRAINT `FK_1i79wnmt5pi0msfu7rwpck74g` FOREIGN KEY (`parameterId`) REFERENCES `Parameter` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `FK_756ht9ilrv623yxt54v7v43if` FOREIGN KEY (`serviceConfigurationId`) REFERENCES `ServiceConfiguration` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3053 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ServiceConfigurationItem`
--

LOCK TABLES `ServiceConfigurationItem` WRITE;
/*!40000 ALTER TABLE `ServiceConfigurationItem` DISABLE KEYS */;
INSERT INTO `ServiceConfigurationItem` VALUES (1,'nasa_amsre',59,1),(2,'ncar_cam5',60,1),(3,'tos',61,1),(4,'tos',62,1),(5,'',63,1),(6,'',64,1),(7,'200312',65,1),(8,'200402',66,1),(9,'0',67,1),(10,'360',68,1),(11,'-90',69,1),(12,'-60',70,1),(13,'500',71,1),(14,'nasa_amsre',59,2),(15,'ncar_cam5',60,2),(16,'tos',61,2),(17,'tos',62,2),(18,'',63,2),(19,'',64,2),(20,'200312',65,2),(21,'200402',66,2),(22,'0',67,2),(23,'360',68,2),(24,'-90',69,2),(25,'-60',70,2),(26,'1000000000',71,2),(27,'nasa_amsre',59,3),(28,'ncar_cam5',60,3),(29,'pr',61,3),(30,'pr',62,3),(31,'',63,3),(32,'',64,3),(33,'200312',65,3),(34,'200402',66,3),(35,'0',67,3),(36,'360',68,3),(37,'-60',69,3),(38,'-30',70,3),(39,'1000000000',71,3),(40,'nasa_amsre',59,4),(41,'ncar_cam5',60,4),(42,'pr',61,4),(43,'pr',62,4),(44,'',63,4),(45,'',64,4),(46,'200312',65,4),(47,'200402',66,4),(48,'0',67,4),(49,'360',68,4),(50,'-90',69,4),(51,'-60',70,4),(52,'1000000000',71,4),(53,'nasa_amsre',59,5),(54,'ncar_cam5',60,5),(55,'tos',61,5),(56,'tos',62,5),(57,'',63,5),(58,'',64,5),(59,'200312',65,5),(60,'200402',66,5),(61,'0',67,5),(62,'360',68,5),(63,'-60',69,5),(64,'-30',70,5),(65,'1000000000',71,5),(66,'nasa_amsre',59,6),(67,'ncar_cam5',60,6),(68,'pr',61,6),(69,'pr',62,6),(70,'',63,6),(71,'',64,6),(72,'200312',65,6),(73,'200402',66,6),(74,'0',67,6),(75,'360',68,6),(76,'-30',69,6),(77,'30',70,6),(78,'1000000000',71,6),(79,'nasa_amsre',59,7),(80,'ncar_cam5',60,7),(81,'tos',61,7),(82,'tos',62,7),(83,'',63,7),(84,'',64,7),(85,'200312',65,7),(86,'200402',66,7),(87,'0',67,7),(88,'360',68,7),(89,'30',69,7),(90,'60',70,7),(91,'1000000000',71,7),(92,'nasa_amsre',59,8),(93,'ncar_cam5',60,8),(94,'tos',61,8),(95,'tos',62,8),(96,'',63,8),(97,'',64,8),(98,'200312',65,8),(99,'200402',66,8),(100,'0',67,8),(101,'360',68,8),(102,'60',69,8),(103,'90',70,8),(104,'1000000000',71,8),(105,'nasa_amsre',59,9),(106,'ncar_cam5',60,9),(107,'tos',61,9),(108,'tos',62,9),(109,'',63,9),(110,'',64,9),(111,'200403',65,9),(112,'200405',66,9),(113,'0',67,9),(114,'360',68,9),(115,'60',69,9),(116,'90',70,9),(117,'1000000000',71,9),(118,'nasa_amsre',59,10),(119,'ncar_cam5',60,10),(120,'tos',61,10),(121,'tos',62,10),(122,'',63,10),(123,'',64,10),(124,'200403',65,10),(125,'200405',66,10),(126,'0',67,10),(127,'360',68,10),(128,'30',69,10),(129,'60',70,10),(130,'1000000000',71,10),(131,'nasa_amsre',59,11),(132,'ncar_cam5',60,11),(133,'tos',61,11),(134,'tos',62,11),(135,'',63,11),(136,'',64,11),(137,'200403',65,11),(138,'200405',66,11),(139,'0',67,11),(140,'360',68,11),(141,'-30',69,11),(142,'30',70,11),(143,'1000000000',71,11),(144,'nasa_amsre',59,12),(145,'ncar_cam5',60,12),(146,'tos',61,12),(147,'tos',62,12),(148,'',63,12),(149,'',64,12),(150,'200403',65,12),(151,'200405',66,12),(152,'0',67,12),(153,'360',68,12),(154,'-60',69,12),(155,'-30',70,12),(156,'1000000000',71,12),(157,'nasa_amsre',59,13),(158,'ncar_cam5',60,13),(159,'tos',61,13),(160,'tos',62,13),(161,'',63,13),(162,'',64,13),(163,'200403',65,13),(164,'200405',66,13),(165,'0',67,13),(166,'360',68,13),(167,'-90',69,13),(168,'-60',70,13),(169,'1000000000',71,13),(170,'nasa_amsre',59,14),(171,'ncar_cam5',60,14),(172,'tos',61,14),(173,'tos',62,14),(174,'',63,14),(175,'',64,14),(176,'200403',65,14),(177,'200405',66,14),(178,'0',67,14),(179,'360',68,14),(180,'-90',69,14),(181,'-60',70,14),(182,'1000000000',71,14),(183,'NASA_AMSRE',19,15),(184,'tos',20,15),(185,'200301',21,15),(186,'201412',22,15),(187,'0',23,15),(188,'360',24,15),(189,'-90',25,15),(190,'90',26,15),(191,'0',27,15),(192,'NASA_AMSRE',19,16),(193,'tos',20,16),(194,'200301',21,16),(195,'201412',22,16),(196,'0',23,16),(197,'360',24,16),(198,'0',25,16),(199,'30',26,16),(200,'0',27,16),(201,'NASA_AMSRE',19,17),(202,'tos',20,17),(203,'200301',21,17),(204,'201012',22,17),(205,'0',23,17),(206,'360',24,17),(207,'30',25,17),(208,'60',26,17),(209,'0',27,17),(210,'NASA_AMSRE',19,18),(211,'tos',20,18),(212,'200301',21,18),(213,'201012',22,18),(214,'0',23,18),(215,'360',24,18),(216,'-60',25,18),(217,'-30',26,18),(218,'0',27,18),(219,'NASA_AMSRE',19,19),(220,'tos',20,19),(221,'200301',21,19),(222,'201012',22,19),(223,'0',23,19),(224,'360',24,19),(225,'-30',25,19),(226,'0',26,19),(227,'0',27,19),(228,'NASA_MODIS',9,20),(229,'clt',10,20),(230,'200401',11,20),(231,'201012',12,20),(232,'-90',14,20),(233,'90',15,20),(234,'0',16,20),(235,'360',17,20),(236,'0',18,20),(237,'1,2,3,4,5,6,7,8,9,10,11,12',13,20),(238,'NASA_MODIS',9,21),(239,'clt',10,21),(240,'200401',11,21),(241,'201012',12,21),(242,'-90',14,21),(243,'90',15,21),(244,'0',16,21),(245,'360',17,21),(246,'0',18,21),(247,'1,2,12',13,21),(248,'nasa_amsre',59,22),(249,'ncar_cam5',60,22),(250,'pr',61,22),(251,'pr',62,22),(252,'',63,22),(253,'',64,22),(254,'200312',65,22),(255,'200402',66,22),(256,'0',67,22),(257,'360',68,22),(258,'-90',69,22),(259,'-60',70,22),(260,'1000000000',71,22),(261,'nasa_amsre',59,23),(262,'ncar_cam5',60,23),(263,'pr',61,23),(264,'pr',62,23),(265,'',63,23),(266,'',64,23),(267,'200312',65,23),(268,'200402',66,23),(269,'0',67,23),(270,'360',68,23),(271,'-90',69,23),(272,'-60',70,23),(273,'1000000000',71,23),(274,'nasa_amsre',59,24),(275,'ncar_cam5',60,24),(276,'pr',61,24),(277,'pr',62,24),(278,'',63,24),(279,'',64,24),(280,'200403',65,24),(281,'200405',66,24),(282,'0',67,24),(283,'360',68,24),(284,'-90',69,24),(285,'-60',70,24),(286,'1000000000',71,24),(287,'nasa_amsre',59,25),(288,'ncar_cam5',60,25),(289,'pr',61,25),(290,'pr',62,25),(291,'',63,25),(292,'',64,25),(293,'200403',65,25),(294,'200405',66,25),(295,'0',67,25),(296,'360',68,25),(297,'-90',69,25),(298,'-60',70,25),(299,'1000000000',71,25),(300,'nasa_amsre',59,26),(301,'ncar_cam5',60,26),(302,'pr',61,26),(303,'pr',62,26),(304,'',63,26),(305,'',64,26),(306,'200403',65,26),(307,'200405',66,26),(308,'0',67,26),(309,'360',68,26),(310,'-90',69,26),(311,'-60',70,26),(312,'1000000000',71,26),(313,'nasa_amsre',59,27),(314,'ncar_cam5',60,27),(315,'pr',61,27),(316,'pr',62,27),(317,'',63,27),(318,'',64,27),(319,'200403',65,27),(320,'200405',66,27),(321,'0',67,27),(322,'360',68,27),(323,'-90',69,27),(324,'-60',70,27),(325,'1000000000',71,27),(326,'NASA_TRMM',9,28),(327,'pr',10,28),(328,'200401',11,28),(329,'200412',12,28),(330,'-90',14,28),(331,'90',15,28),(332,'0',16,28),(333,'360',17,28),(334,'0',18,28),(335,'1,2,3,4,5,6,7,8,9,10,11,12',13,28),(336,'NASA_TRMM',9,29),(337,'pr',10,29),(338,'200401',11,29),(339,'200412',12,29),(340,'-90',14,29),(341,'90',15,29),(342,'0',16,29),(343,'360',17,29),(344,'0',18,29),(345,'1,2,12',13,29),(346,'NASA_TRMM',9,30),(347,'clt',10,30),(348,'200401',11,30),(349,'200412',12,30),(350,'-90',14,30),(351,'90',15,30),(352,'0',16,30),(353,'360',17,30),(354,'0',18,30),(355,'3,4,5',13,30),(356,'NASA_TRMM',9,31),(357,'pr',10,31),(358,'200401',11,31),(359,'200412',12,31),(360,'-90',14,31),(361,'90',15,31),(362,'0',16,31),(363,'360',17,31),(364,'0',18,31),(365,'3,4,5',13,31),(366,'NASA_TRMM',9,32),(367,'clt',10,32),(368,'200401',11,32),(369,'200412',12,32),(370,'-90',14,32),(371,'90',15,32),(372,'0',16,32),(373,'360',17,32),(374,'0',18,32),(375,'6,7,8',13,32),(376,'NASA_MODIS',9,33),(377,'clt',10,33),(378,'200401',11,33),(379,'200412',12,33),(380,'-90',14,33),(381,'90',15,33),(382,'0',16,33),(383,'360',17,33),(384,'0',18,33),(385,'6,7,8',13,33),(386,'NASA_TRMM',9,34),(387,'pr',10,34),(388,'200401',11,34),(389,'200412',12,34),(390,'-90',14,34),(391,'90',15,34),(392,'0',16,34),(393,'360',17,34),(394,'0',18,34),(395,'6,7,8',13,34),(396,'NASA_TRMM',9,35),(397,'pr',10,35),(398,'200401',11,35),(399,'201012',12,35),(400,'-90',14,35),(401,'90',15,35),(402,'0',16,35),(403,'360',17,35),(404,'0',18,35),(405,'6,7,8',13,35),(406,'NASA_TRMM',9,36),(407,'pr',10,36),(408,'200401',11,36),(409,'201012',12,36),(410,'-90',14,36),(411,'90',15,36),(412,'0',16,36),(413,'360',17,36),(414,'0',18,36),(415,'9,10,11',13,36),(416,'NASA_AMSRE',9,37),(417,'tos',10,37),(418,'200401',11,37),(419,'201012',12,37),(420,'-90',14,37),(421,'90',15,37),(422,'0',16,37),(423,'360',17,37),(424,'0',18,37),(425,'1,2,3,4,5,6,7,8,9,10,11,12',13,37),(426,'NASA_MODIS',9,38),(427,'clt',10,38),(428,'200401',11,38),(429,'201012',12,38),(430,'-90',14,38),(431,'90',15,38),(432,'0',16,38),(433,'360',17,38),(434,'0',18,38),(435,'1,2,12',13,38),(436,'NASA_AMSRE',9,39),(437,'tos',10,39),(438,'200401',11,39),(439,'201012',12,39),(440,'-90',14,39),(441,'90',15,39),(442,'0',16,39),(443,'360',17,39),(444,'0',18,39),(445,'3,4,5',13,39),(446,'NASA_AMSRE',9,40),(447,'tos',10,40),(448,'200401',11,40),(449,'201012',12,40),(450,'-90',14,40),(451,'90',15,40),(452,'0',16,40),(453,'360',17,40),(454,'0',18,40),(455,'6,7,8',13,40),(456,'NASA_AMSRE',9,41),(457,'tos',10,41),(458,'200401',11,41),(459,'201012',12,41),(460,'-90',14,41),(461,'90',15,41),(462,'0',16,41),(463,'360',17,41),(464,'0',18,41),(465,'9,10,11',13,41),(466,'nasa_modis',59,42),(467,'nasa_amsre',60,42),(468,'clt',61,42),(469,'tos',62,42),(470,'',63,42),(471,'',64,42),(472,'200401',65,42),(473,'200412',66,42),(474,'0',67,42),(475,'360',68,42),(476,'-90',69,42),(477,'90',70,42),(478,'1000',71,42),(479,'nasa_modis',59,43),(480,'nasa_amsre',60,43),(481,'clt',61,43),(482,'tos',62,43),(483,'',63,43),(484,'',64,43),(485,'200401',65,43),(486,'200412',66,43),(487,'0',67,43),(488,'360',68,43),(489,'-90',69,43),(490,'90',70,43),(491,'10000',71,43),(492,'nasa_modis',59,44),(493,'nasa_amsre',60,44),(494,'clt',61,44),(495,'tos',62,44),(496,'',63,44),(497,'',64,44),(498,'200401',65,44),(499,'200412',66,44),(500,'0',67,44),(501,'360',68,44),(502,'-30',69,44),(503,'30',70,44),(504,'10000',71,44),(505,'nasa_trmm',59,45),(506,'nasa_amsre',60,45),(507,'pr',61,45),(508,'tos',62,45),(509,'',63,45),(510,'',64,45),(511,'200401',65,45),(512,'200412',66,45),(513,'0',67,45),(514,'360',68,45),(515,'-90',69,45),(516,'90',70,45),(517,'10000',71,45),(518,'nasa_trmm',59,46),(519,'nasa_amsre',60,46),(520,'pr',61,46),(521,'tos',62,46),(522,'',63,46),(523,'',64,46),(524,'200401',65,46),(525,'200412',66,46),(526,'0',67,46),(527,'360',68,46),(528,'-90',69,46),(529,'90',70,46),(530,'10000',71,46),(531,'nasa_modis',59,47),(532,'ecmwf_interim',60,47),(533,'clt',61,47),(534,'wap',62,47),(535,'',63,47),(536,'',64,47),(537,'200401',65,47),(538,'200412',66,47),(539,'0',67,47),(540,'360',68,47),(541,'-90',69,47),(542,'90',70,47),(543,'10000',71,47),(544,'nasa_modis',59,48),(545,'ecmwf_interim',60,48),(546,'clt',61,48),(547,'wap',62,48),(548,'',63,48),(549,'',64,48),(550,'200401',65,48),(551,'200412',66,48),(552,'0',67,48),(553,'360',68,48),(554,'-90',69,48),(555,'90',70,48),(556,'10000',71,48),(557,'NASA_MODIS',19,49),(558,'clt',20,49),(559,'200401',21,49),(560,'201112',22,49),(561,'0',23,49),(562,'360',24,49),(563,'-90',25,49),(564,'90',26,49),(565,'0',27,49),(566,'NASA_MODIS',19,50),(567,'clt',20,50),(568,'200401',21,50),(569,'201109',22,50),(570,'0',23,50),(571,'360',24,50),(572,'30',25,50),(573,'50',26,50),(574,'0',27,50),(575,'NASA_MODIS',19,51),(576,'clt',20,51),(577,'200401',21,51),(578,'201109',22,51),(579,'0',23,51),(580,'360',24,51),(581,'-50',25,51),(582,'-30',26,51),(583,'0',27,51),(584,'NASA_MODIS',19,52),(585,'clt',20,52),(586,'200401',21,52),(587,'201109',22,52),(588,'0',23,52),(589,'360',24,52),(590,'-15',25,52),(591,'15',26,52),(592,'0',27,52),(593,'NASA_MODIS',19,53),(594,'clt',20,53),(595,'200401',21,53),(596,'201109',22,53),(597,'0',23,53),(598,'360',24,53),(599,'15',25,53),(600,'30',26,53),(601,'0',27,53),(602,'NASA_MODIS',19,54),(603,'clt',20,54),(604,'200401',21,54),(605,'201109',22,54),(606,'0',23,54),(607,'360',24,54),(608,'-30',25,54),(609,'-15',26,54),(610,'0',27,54),(611,'NASA_MODIS',1,55),(612,'clt',2,55),(613,'200501',3,55),(614,'200512',4,55),(615,'1,2,3,4,5,6,7,8,9,10,11,12',5,55),(616,'-90',6,55),(617,'90',7,55),(618,'0',8,55),(619,'NASA_MODIS',1,56),(620,'clt',2,56),(621,'200601',3,56),(622,'200612',4,56),(623,'1,2,3,4,5,6,7,8,9,10,11,12',5,56),(624,'-90',6,56),(625,'90',7,56),(626,'0',8,56),(627,'NASA_MODIS',1,57),(628,'clt',2,57),(629,'200701',3,57),(630,'200712',4,57),(631,'1,2,3,4,5,6,7,8,9,10,11,12',5,57),(632,'-90',6,57),(633,'90',7,57),(634,'0',8,57),(635,'miroc_miroc5',72,58),(636,'nasa_modis',73,58),(637,'clt',74,58),(638,'clt',75,58),(639,'',76,58),(640,'',77,58),(641,'200401',78,58),(642,'200412',79,58),(643,'0',80,58),(644,'360',81,58),(645,'-90',82,58),(646,'90',83,58),(647,'miroc_miroc5',72,59),(648,'nasa_modis',73,59),(649,'clt',74,59),(650,'clt',75,59),(651,'',76,59),(652,'',77,59),(653,'200401',78,59),(654,'200612',79,59),(655,'0',80,59),(656,'360',81,59),(657,'-90',82,59),(658,'90',83,59),(659,'NASA_TRMM',9,60),(660,'clt',10,60),(661,'200401',11,60),(662,'200412',12,60),(663,'-90',14,60),(664,'90',15,60),(665,'0',16,60),(666,'360',17,60),(667,'0',18,60),(668,'3,4,5',13,60),(669,'nasa_amsre',59,61),(670,'ncar_cam5',60,61),(671,'tos',61,61),(672,'pr',62,61),(673,'',63,61),(674,'',64,61),(675,'200403',65,61),(676,'200405',66,61),(677,'0',67,61),(678,'360',68,61),(679,'-90',69,61),(680,'-60',70,61),(681,'1000000000',71,61),(682,'nasa_amsre',59,62),(683,'ncar_cam5',60,62),(684,'tos',61,62),(685,'pr',62,62),(686,'',63,62),(687,'',64,62),(688,'200403',65,62),(689,'200405',66,62),(690,'0',67,62),(691,'360',68,62),(692,'-90',69,62),(693,'-60',70,62),(694,'1000000000',71,62),(695,'NASA_TRMM',9,63),(696,'clt',10,63),(697,'200401',11,63),(698,'200412',12,63),(699,'-90',14,63),(700,'90',15,63),(701,'0',16,63),(702,'360',17,63),(703,'0',18,63),(704,'3,4,5',13,63),(705,'NASA_TRMM',9,64),(706,'clt',10,64),(707,'200401',11,64),(708,'200412',12,64),(709,'-90',14,64),(710,'90',15,64),(711,'0',16,64),(712,'360',17,64),(713,'0',18,64),(714,'3,4,5',13,64),(715,'miroc_miroc5',72,65),(716,'cccma_canesm2',73,65),(717,'pr',74,65),(718,'pr',75,65),(719,'',76,65),(720,'',77,65),(721,'200401',78,65),(722,'200412',79,65),(723,'0',80,65),(724,'360',81,65),(725,'-90',82,65),(726,'90',83,65),(727,'NASA_TRMM',9,66),(728,'clt',10,66),(729,'200401',11,66),(730,'200412',12,66),(731,'-90',14,66),(732,'90',15,66),(733,'0',16,66),(734,'360',17,66),(735,'0',18,66),(736,'3,4,5',13,66),(737,'NASA_AMSRE',19,67),(738,'clt',20,67),(739,'200301',21,67),(740,'201012',22,67),(741,'0',23,67),(742,'360',24,67),(743,'-30',25,67),(744,'0',26,67),(745,'0',27,67),(746,'NASA_AMSRE',19,68),(747,'clt',20,68),(748,'200301',21,68),(749,'201012',22,68),(750,'0',23,68),(751,'360',24,68),(752,'-30',25,68),(753,'0',26,68),(754,'0',27,68),(755,'NASA_TRMM',9,69),(756,'pr',10,69),(757,'200401',11,69),(758,'200412',12,69),(759,'-90',14,69),(760,'90',15,69),(761,'0',16,69),(762,'360',17,69),(763,'0',18,69),(764,'6,7,8',13,69),(765,'NASA_TRMM',9,70),(766,'clt',10,70),(767,'200401',11,70),(768,'200412',12,70),(769,'-90',14,70),(770,'90',15,70),(771,'0',16,70),(772,'360',17,70),(773,'0',18,70),(774,'1,2,12',13,70),(775,'NASA_TRMM',9,71),(776,'clt',10,71),(777,'200401',11,71),(778,'200412',12,71),(779,'-90',14,71),(780,'90',15,71),(781,'0',16,71),(782,'360',17,71),(783,'0',18,71),(784,'9,10,11',13,71),(785,'NASA_TRMM',9,72),(786,'clt',10,72),(787,'200401',11,72),(788,'200412',12,72),(789,'-90',14,72),(790,'90',15,72),(791,'0',16,72),(792,'360',17,72),(793,'0',18,72),(794,'3,4,5',13,72),(795,'NASA_TRMM',9,73),(796,'clt',10,73),(797,'200401',11,73),(798,'200412',12,73),(799,'-90',14,73),(800,'90',15,73),(801,'0',16,73),(802,'360',17,73),(803,'0',18,73),(804,'6,7,8',13,73),(805,'NASA_TRMM',9,74),(806,'clt',10,74),(807,'200401',11,74),(808,'200412',12,74),(809,'-90',14,74),(810,'90',15,74),(811,'0',16,74),(812,'360',17,74),(813,'0',18,74),(814,'3,4,5',13,74),(815,'NASA_TRMM',9,75),(816,'pr',10,75),(817,'200401',11,75),(818,'200412',12,75),(819,'-90',14,75),(820,'90',15,75),(821,'0',16,75),(822,'360',17,75),(823,'0',18,75),(824,'3,4,5',13,75),(825,'NASA_TRMM',9,76),(826,'pr',10,76),(827,'200401',11,76),(828,'200412',12,76),(829,'-90',14,76),(830,'90',15,76),(831,'0',16,76),(832,'360',17,76),(833,'0',18,76),(834,'3,4,5',13,76),(835,'NASA_TRMM',9,77),(836,'pr',10,77),(837,'200401',11,77),(838,'200412',12,77),(839,'-90',14,77),(840,'90',15,77),(841,'0',16,77),(842,'360',17,77),(843,'0',18,77),(844,'3,4,5',13,77),(845,'NASA_TRMM',9,78),(846,'pr',10,78),(847,'200401',11,78),(848,'200412',12,78),(849,'-90',14,78),(850,'90',15,78),(851,'0',16,78),(852,'360',17,78),(853,'0',18,78),(854,'3,4,5',13,78),(855,'NASA_MODIS',1,79),(856,'clt',2,79),(857,'200401',3,79),(858,'200412',4,79),(859,'1,2,3,4,5,6,7,8,9,10,11,12',5,79),(860,'-90',6,79),(861,'90',7,79),(862,'0',8,79),(876,'NASA_MODIS',9,81),(877,'clt',10,81),(878,'',11,81),(879,'',12,81),(880,'',14,81),(881,'',15,81),(882,'',16,81),(883,'',17,81),(884,'4',18,81),(885,'3,4,5',13,81),(886,'cccma_canesm2',59,82),(887,'cccma_canesm2',60,82),(888,'pr',61,82),(889,'pr',62,82),(890,'',63,82),(891,'',64,82),(892,'200401',65,82),(893,'200412',66,82),(894,'0',67,82),(895,'360',68,82),(896,'-90',69,82),(897,'90',70,82),(898,'500',71,82),(912,'NASA_TRMM',9,84),(913,'pr',10,84),(914,'200401',11,84),(915,'200412',12,84),(916,'-90',14,84),(917,'90',15,84),(918,'0',16,84),(919,'360',17,84),(920,'0',18,84),(921,'6,7,8',13,84),(922,'NASA_AIRS',39,85),(923,'ta',40,85),(924,'200401',41,85),(925,'200412',42,85),(926,'-90',43,85),(927,'90',44,85),(928,'20000',45,85),(929,'90000',46,85),(930,'1,2,3,4,5,6,7,8,9,10,11,12',47,85),(931,'2',48,85),(932,'NASA_MODIS',9,86),(933,'clt',10,86),(934,'200401',11,86),(935,'200412',12,86),(936,'-90',14,86),(937,'90',15,86),(938,'0',16,86),(939,'360',17,86),(940,'0',18,86),(941,'1,2,3,4,5,6,7,8,9,10,11,12',13,86),(942,'cccma_canesm2',59,87),(943,'cccma_canesm2',60,87),(944,'pr',61,87),(945,'pr',62,87),(946,'',63,87),(947,'',64,87),(948,'200401',65,87),(949,'200412',66,87),(950,'0',67,87),(951,'360',68,87),(952,'-90',69,87),(953,'90',70,87),(954,'500',71,87),(955,'NASA_MODIS',9,88),(956,'clt',10,88),(957,'200401',11,88),(958,'200412',12,88),(959,'-90',14,88),(960,'90',15,88),(961,'0',16,88),(962,'360',17,88),(963,'0',18,88),(964,'1,2,3,4,5,6,7,8,9,10,11,12',13,88),(965,'NASA_MODIS',9,89),(966,'clt',10,89),(967,'200401',11,89),(968,'200412',12,89),(969,'-90',14,89),(970,'90',15,89),(971,'0',16,89),(972,'360',17,89),(973,'0',18,89),(974,'1,2,3,4,5,6,7,8,9,10,11,12',13,89),(975,'NASA_MODIS',9,90),(976,'clt',10,90),(977,'200401',11,90),(978,'200412',12,90),(979,'-90',14,90),(980,'90',15,90),(981,'0',16,90),(982,'360',17,90),(983,'0',18,90),(984,'1,2,3,4,5,6,7,8,9,10,11,12',13,90),(985,'NASA_TRMM',9,91),(986,'pr',10,91),(987,'200401',11,91),(988,'200412',12,91),(989,'-90',14,91),(990,'90',15,91),(991,'0',16,91),(992,'360',17,91),(993,'0',18,91),(994,'6,7,8',13,91),(1031,'NASA_AIRS',39,95),(1032,'ta',40,95),(1033,'200401',41,95),(1034,'200412',42,95),(1035,'-90',43,95),(1036,'90',44,95),(1037,'20000',45,95),(1038,'90000',46,95),(1039,'1,2,3,4,5,6,7,8,9,10,11,12',47,95),(1040,'2',48,95),(1041,'NASA_MODIS',9,96),(1042,'clt',10,96),(1043,'200401',11,96),(1044,'200412',12,96),(1045,'-90',14,96),(1046,'90',15,96),(1047,'0',16,96),(1048,'360',17,96),(1049,'0',18,96),(1050,'1,2,3,4,5,6,7,8,9,10,11,12',13,96),(1051,'cccma_canesm2',59,97),(1052,'cccma_canesm2',60,97),(1053,'pr',61,97),(1054,'pr',62,97),(1055,'',63,97),(1056,'',64,97),(1057,'200401',65,97),(1058,'200412',66,97),(1059,'0',67,97),(1060,'360',68,97),(1061,'-90',69,97),(1062,'90',70,97),(1063,'500',71,97),(1064,'cccma_canesm2',59,98),(1065,'cccma_canesm2',60,98),(1066,'pr',61,98),(1067,'pr',62,98),(1068,'',63,98),(1069,'',64,98),(1070,'200401',65,98),(1071,'200412',66,98),(1072,'0',67,98),(1073,'360',68,98),(1074,'-90',69,98),(1075,'90',70,98),(1076,'500',71,98),(1077,'cccma_canesm2',59,99),(1078,'cccma_canesm2',60,99),(1079,'pr',61,99),(1080,'pr',62,99),(1081,'',63,99),(1082,'',64,99),(1083,'200401',65,99),(1084,'200412',66,99),(1085,'0',67,99),(1086,'360',68,99),(1087,'-90',69,99),(1088,'90',70,99),(1089,'500',71,99),(1103,'cccma_canesm2',59,101),(1104,'cccma_canesm2',60,101),(1105,'pr',61,101),(1106,'pr',62,101),(1107,'',63,101),(1108,'',64,101),(1109,'200401',65,101),(1110,'200412',66,101),(1111,'0',67,101),(1112,'360',68,101),(1113,'-90',69,101),(1114,'90',70,101),(1115,'500',71,101),(1116,'cccma_canesm2',59,102),(1117,'cccma_canesm2',60,102),(1118,'pr',61,102),(1119,'pr',62,102),(1120,'',63,102),(1121,'',64,102),(1122,'200401',65,102),(1123,'200412',66,102),(1124,'0',67,102),(1125,'360',68,102),(1126,'-90',69,102),(1127,'90',70,102),(1128,'500',71,102),(1129,'cccma_canesm2',59,103),(1130,'cccma_canesm2',60,103),(1131,'pr',61,103),(1132,'pr',62,103),(1133,'',63,103),(1134,'',64,103),(1135,'200401',65,103),(1136,'200412',66,103),(1137,'0',67,103),(1138,'360',68,103),(1139,'-90',69,103),(1140,'90',70,103),(1141,'500',71,103),(1155,'cccma_canesm2',59,105),(1156,'cccma_canesm2',60,105),(1157,'pr',61,105),(1158,'pr',62,105),(1159,'',63,105),(1160,'',64,105),(1161,'200401',65,105),(1162,'200412',66,105),(1163,'0',67,105),(1164,'360',68,105),(1165,'-90',69,105),(1166,'90',70,105),(1167,'500',71,105),(1168,'cccma_canesm2',59,106),(1169,'cccma_canesm2',60,106),(1170,'pr',61,106),(1171,'pr',62,106),(1172,'',63,106),(1173,'',64,106),(1174,'200401',65,106),(1175,'200412',66,106),(1176,'0',67,106),(1177,'360',68,106),(1178,'-90',69,106),(1179,'90',70,106),(1180,'500',71,106),(1181,'cccma_canesm2',59,107),(1182,'cccma_canesm2',60,107),(1183,'pr',61,107),(1184,'pr',62,107),(1185,'',63,107),(1186,'',64,107),(1187,'200401',65,107),(1188,'200412',66,107),(1189,'0',67,107),(1190,'360',68,107),(1191,'-90',69,107),(1192,'90',70,107),(1193,'500',71,107),(1194,'cccma_canesm2',59,108),(1195,'cccma_canesm2',60,108),(1196,'pr',61,108),(1197,'pr',62,108),(1198,'',63,108),(1199,'',64,108),(1200,'200401',65,108),(1201,'200412',66,108),(1202,'0',67,108),(1203,'360',68,108),(1204,'-90',69,108),(1205,'90',70,108),(1206,'500',71,108),(1207,'cccma_canesm2',59,109),(1208,'cccma_canesm2',60,109),(1209,'pr',61,109),(1210,'pr',62,109),(1211,'',63,109),(1212,'',64,109),(1213,'200401',65,109),(1214,'200412',66,109),(1215,'0',67,109),(1216,'360',68,109),(1217,'-90',69,109),(1218,'90',70,109),(1219,'500',71,109),(1220,'cccma_canesm2',59,110),(1221,'cccma_canesm2',60,110),(1222,'pr',61,110),(1223,'pr',62,110),(1224,'',63,110),(1225,'',64,110),(1226,'200401',65,110),(1227,'200412',66,110),(1228,'0',67,110),(1229,'360',68,110),(1230,'-90',69,110),(1231,'90',70,110),(1232,'500',71,110),(1233,'cccma_canesm2',59,111),(1234,'cccma_canesm2',60,111),(1235,'pr',61,111),(1236,'pr',62,111),(1237,'',63,111),(1238,'',64,111),(1239,'200401',65,111),(1240,'200412',66,111),(1241,'0',67,111),(1242,'360',68,111),(1243,'-90',69,111),(1244,'90',70,111),(1245,'500',71,111),(1246,'cccma_canesm2',59,112),(1247,'cccma_canesm2',60,112),(1248,'pr',61,112),(1249,'pr',62,112),(1250,'',63,112),(1251,'',64,112),(1252,'200401',65,112),(1253,'200412',66,112),(1254,'0',67,112),(1255,'360',68,112),(1256,'-90',69,112),(1257,'90',70,112),(1258,'500',71,112),(1259,'cccma_canesm2',59,113),(1260,'cccma_canesm2',60,113),(1261,'pr',61,113),(1262,'pr',62,113),(1263,'',63,113),(1264,'',64,113),(1265,'200401',65,113),(1266,'200412',66,113),(1267,'0',67,113),(1268,'360',68,113),(1269,'-90',69,113),(1270,'90',70,113),(1271,'500',71,113),(1272,'cccma_canesm2',59,114),(1273,'cccma_canesm2',60,114),(1274,'pr',61,114),(1275,'pr',62,114),(1276,'',63,114),(1277,'',64,114),(1278,'200401',65,114),(1279,'200412',66,114),(1280,'0',67,114),(1281,'360',68,114),(1282,'-90',69,114),(1283,'90',70,114),(1284,'500',71,114),(1285,'cccma_canesm2',59,115),(1286,'cccma_canesm2',60,115),(1287,'pr',61,115),(1288,'pr',62,115),(1289,'',63,115),(1290,'',64,115),(1291,'200401',65,115),(1292,'200412',66,115),(1293,'0',67,115),(1294,'360',68,115),(1295,'-90',69,115),(1296,'90',70,115),(1297,'500',71,115),(1298,'cccma_canesm2',59,116),(1299,'cccma_canesm2',60,116),(1300,'pr',61,116),(1301,'pr',62,116),(1302,'',63,116),(1303,'',64,116),(1304,'200401',65,116),(1305,'200412',66,116),(1306,'0',67,116),(1307,'360',68,116),(1308,'-90',69,116),(1309,'90',70,116),(1310,'500',71,116),(1324,'NASA_MODIS',9,118),(1325,'clt',10,118),(1326,'200401',11,118),(1327,'200412',12,118),(1328,'-90',14,118),(1329,'90',15,118),(1330,'0',16,118),(1331,'360',17,118),(1332,'0',18,118),(1333,'1,2,3,4,5,6,7,8,9,10,11,12',13,118),(1334,'NASA_MODIS',1,119),(1335,'clt',2,119),(1336,'200401',3,119),(1337,'200412',4,119),(1338,'1,2,3,4,5,6,7,8,9,10,11,12',5,119),(1339,'-90',6,119),(1340,'90',7,119),(1341,'0',8,119),(1342,'NASA_MODIS',19,120),(1343,'clt',20,120),(1344,'200401',21,120),(1345,'200412',22,120),(1346,'0',23,120),(1347,'360',24,120),(1348,'-90',25,120),(1349,'90',26,120),(1350,'0',27,120),(1351,'NASA_AIRS',28,121),(1352,'ta',29,121),(1353,'200401',30,121),(1354,'200412',31,121),(1355,'50000',32,121),(1356,'0',33,121),(1357,'360',34,121),(1358,'-90',35,121),(1359,'90',36,121),(1360,'1,2,3,4,5,6,7,8,9,10,11,12',37,121),(1361,'0',38,121),(1362,'NASA_MODIS',9,122),(1363,'clt',10,122),(1364,'200401',11,122),(1365,'200412',12,122),(1366,'-90',14,122),(1367,'90',15,122),(1368,'0',16,122),(1369,'360',17,122),(1370,'0',18,122),(1371,'1,2,3,4,5,6,7,8,9,10,11,12',13,122),(1372,'NASA_MODIS',9,123),(1373,'clt',10,123),(1374,'200401',11,123),(1375,'200412',12,123),(1376,'-90',14,123),(1377,'90',15,123),(1378,'0',16,123),(1379,'360',17,123),(1380,'0',18,123),(1381,'1,2,3,4,5,6,7,8,9,10,11,12',13,123),(1382,'NASA_MODIS',9,124),(1383,'clt',10,124),(1384,'200401',11,124),(1385,'200412',12,124),(1386,'-90',14,124),(1387,'90',15,124),(1388,'0',16,124),(1389,'360',17,124),(1390,'0',18,124),(1391,'1,2,3,4,5,6,7,8,9,10,11,12',13,124),(1392,'cccma_canesm2',59,125),(1393,'cccma_canesm2',60,125),(1394,'pr',61,125),(1395,'pr',62,125),(1396,'',63,125),(1397,'',64,125),(1398,'200401',65,125),(1399,'200412',66,125),(1400,'0',67,125),(1401,'360',68,125),(1402,'-90',69,125),(1403,'90',70,125),(1404,'500',71,125),(1405,'cccma_canesm2',59,126),(1406,'cccma_canesm2',60,126),(1407,'pr',61,126),(1408,'pr',62,126),(1409,'',63,126),(1410,'',64,126),(1411,'200401',65,126),(1412,'200412',66,126),(1413,'0',67,126),(1414,'360',68,126),(1415,'-90',69,126),(1416,'90',70,126),(1417,'500',71,126),(1418,'cccma_canesm2',59,127),(1419,'cccma_canesm2',60,127),(1420,'pr',61,127),(1421,'pr',62,127),(1422,'',63,127),(1423,'',64,127),(1424,'200401',65,127),(1425,'200412',66,127),(1426,'0',67,127),(1427,'360',68,127),(1428,'-90',69,127),(1429,'90',70,127),(1430,'500',71,127),(1431,'cccma_canesm2',59,128),(1432,'cccma_canesm2',60,128),(1433,'pr',61,128),(1434,'pr',62,128),(1435,'',63,128),(1436,'',64,128),(1437,'200401',65,128),(1438,'200412',66,128),(1439,'0',67,128),(1440,'360',68,128),(1441,'-90',69,128),(1442,'90',70,128),(1443,'500',71,128),(1444,'NASA_MODIS',1,129),(1445,'clt',2,129),(1446,'200501',3,129),(1447,'200512',4,129),(1448,'1,2,3,4,5,6,7,8,9,10,11,12',5,129),(1449,'-90',6,129),(1450,'90',7,129),(1451,'0',8,129),(1452,'cccma_canesm2',59,130),(1453,'cccma_canesm2',60,130),(1454,'pr',61,130),(1455,'pr',62,130),(1456,'',63,130),(1457,'',64,130),(1458,'200401',65,130),(1459,'200412',66,130),(1460,'0',67,130),(1461,'360',68,130),(1462,'-90',69,130),(1463,'90',70,130),(1464,'500',71,130),(1465,'nasa_amsre',59,131),(1466,'ncar_cam5',60,131),(1467,'tos',61,131),(1468,'pr',62,131),(1469,'',63,131),(1470,'',64,131),(1471,'200312',65,131),(1472,'200402',66,131),(1473,'0',67,131),(1474,'360',68,131),(1475,'-90',69,131),(1476,'-60',70,131),(1477,'500',71,131),(1478,'NASA_AIRS',49,132),(1479,'ta',50,132),(1480,'200401',51,132),(1481,'200412',52,132),(1482,'0',53,132),(1483,'360',54,132),(1484,'-90',55,132),(1485,'90',56,132),(1486,'1,2,3,4,5,6,7,8,9,10,11,12',57,132),(1487,'2',58,132),(1488,'NASA_AIRS',49,133),(1489,'ta',50,133),(1490,'200406',51,133),(1491,'20048',52,133),(1492,'0',53,133),(1493,'360',54,133),(1494,'-90',55,133),(1495,'90',56,133),(1496,'1,2,3,4,5,6,7,8,9,10,11,12',57,133),(1497,'2',58,133),(1498,'NASA_AIRS',49,134),(1499,'ta',50,134),(1500,'200406',51,134),(1501,'20048',52,134),(1502,'0',53,134),(1503,'360',54,134),(1504,'-90',55,134),(1505,'90',56,134),(1506,'1,2,3,4,5,6,7,8,9,10,11,12',57,134),(1507,'2',58,134),(1508,'NASA_AIRS',39,135),(1509,'ta',40,135),(1510,'200401',41,135),(1511,'200412',42,135),(1512,'-90',43,135),(1513,'90',44,135),(1514,'20000',45,135),(1515,'90000',46,135),(1516,'1,2,3,4,5,6,7,8,9,10,11,12',47,135),(1517,'2',48,135),(1518,'NASA_AIRS',39,136),(1519,'ta',40,136),(1520,'200406',41,136),(1521,'200408',42,136),(1522,'-90',43,136),(1523,'90',44,136),(1524,'20000',45,136),(1525,'90000',46,136),(1526,'1,2,3,4,5,6,7,8,9,10,11,12',47,136),(1527,'2',48,136),(1528,'NASA_AIRS',39,137),(1529,'ta',40,137),(1530,'200406',41,137),(1531,'200408',42,137),(1532,'-90',43,137),(1533,'90',44,137),(1534,'20000',45,137),(1535,'90000',46,137),(1536,'6,7,8',47,137),(1537,'2',48,137),(1538,'NASA_AIRS',39,138),(1539,'ta',40,138),(1540,'200406',41,138),(1541,'200408',42,138),(1542,'-90',43,138),(1543,'90',44,138),(1544,'20000',45,138),(1545,'90000',46,138),(1546,'6,7,8,9',47,138),(1547,'2',48,138),(1548,'NASA_AIRS',39,139),(1549,'ta',40,139),(1550,'200406',41,139),(1551,'200408',42,139),(1552,'-90',43,139),(1553,'90',44,139),(1554,'20000',45,139),(1555,'90000',46,139),(1556,'6,7',47,139),(1557,'2',48,139),(1558,'NASA_AIRS',39,140),(1559,'ta',40,140),(1560,'200406',41,140),(1561,'200408',42,140),(1562,'-90',43,140),(1563,'90',44,140),(1564,'20000',45,140),(1565,'90000',46,140),(1566,'1,2,3,4,5,6,7,8,9,10,11,12',47,140),(1567,'2',48,140),(1568,'NASA_AIRS',39,141),(1569,'ta',40,141),(1570,'200406',41,141),(1571,'200408',42,141),(1572,'-90',43,141),(1573,'90',44,141),(1574,'20000',45,141),(1575,'90000',46,141),(1576,'6,7,8',47,141),(1577,'2',48,141),(1578,'cccma_canesm2',59,142),(1579,'cccma_canesm2',60,142),(1580,'pr',61,142),(1581,'pr',62,142),(1582,'',63,142),(1583,'',64,142),(1584,'200401',65,142),(1585,'200412',66,142),(1586,'0',67,142),(1587,'360',68,142),(1588,'-90',69,142),(1589,'90',70,142),(1590,'500',71,142),(1591,'cccma_canesm2',59,143),(1592,'cccma_canesm2',60,143),(1593,'pr',61,143),(1594,'pr',62,143),(1595,'',63,143),(1596,'',64,143),(1597,'200401',65,143),(1598,'200412',66,143),(1599,'0',67,143),(1600,'360',68,143),(1601,'-90',69,143),(1602,'90',70,143),(1603,'500',71,143),(1604,'NASA_MODIS',9,144),(1605,'clt',10,144),(1606,'200401',11,144),(1607,'200412',12,144),(1608,'-90',14,144),(1609,'90',15,144),(1610,'0',16,144),(1611,'360',17,144),(1612,'0',18,144),(1613,'1,2,3,4,5,6,7,8,9,10,11,12',13,144),(1614,'NASA_MODIS',9,145),(1615,'clt',10,145),(1616,'200401',11,145),(1617,'200412',12,145),(1618,'-90',14,145),(1619,'90',15,145),(1620,'0',16,145),(1621,'360',17,145),(1622,'0',18,145),(1623,'1,2,3,4,5,6,7,8,9,10,11,12',13,145),(1624,'NASA_MODIS',1,146),(1625,'clt',2,146),(1626,'200401',3,146),(1627,'200412',4,146),(1628,'1,2,3,4,5,6,7,8,9,10,11,12',5,146),(1629,'-90',6,146),(1630,'90',7,146),(1631,'0',8,146),(1632,'NASA_MODIS',1,147),(1633,'clt',2,147),(1634,'200401',3,147),(1635,'200412',4,147),(1636,'1,2,3,4,5,6,7,8,9,10,11,12',5,147),(1637,'-90',6,147),(1638,'90',7,147),(1639,'0',8,147),(1640,'NASA_MODIS',1,148),(1641,'clt',2,148),(1642,'200401',3,148),(1643,'200412',4,148),(1644,'1,2,3,4,5,6,7,8,9,10,11,12',5,148),(1645,'-90',6,148),(1646,'90',7,148),(1647,'0',8,148),(1648,'NASA_MODIS',1,149),(1649,'clt',2,149),(1650,'200401',3,149),(1651,'200412',4,149),(1652,'1,2,3,4,5,6,7,8,9,10,11,12',5,149),(1653,'-90',6,149),(1654,'90',7,149),(1655,'0',8,149),(1656,'NASA_MODIS',9,150),(1657,'clt',10,150),(1658,'200401',11,150),(1659,'200412',12,150),(1660,'-90',14,150),(1661,'90',15,150),(1662,'0',16,150),(1663,'360',17,150),(1664,'0',18,150),(1665,'1,2,3,4,5,6,7,8,9,10,11,12',13,150),(1666,'NASA_AMSRE',9,151),(1667,'tos',10,151),(1668,'200501',11,151),(1669,'200512',12,151),(1670,'0',14,151),(1671,'180',15,151),(1672,'90',16,151),(1673,'270',17,151),(1674,'4',18,151),(1675,'6,7,8',13,151),(1676,'NASA_MODIS',9,152),(1677,'clt',10,152),(1678,'201401',11,152),(1679,'201412',12,152),(1680,'-90',14,152),(1681,'90',15,152),(1682,'0',16,152),(1683,'360',17,152),(1684,'4',18,152),(1685,'6,7,8',13,152),(1686,'NASA_MODIS',9,153),(1687,'clt',10,153),(1688,'201401',11,153),(1689,'201412',12,153),(1690,'-90',14,153),(1691,'90',15,153),(1692,'0',16,153),(1693,'360',17,153),(1694,'4',18,153),(1695,'6,7,8',13,153),(1696,'NASA_MODIS',9,154),(1697,'clt',10,154),(1698,'200401',11,154),(1699,'200412',12,154),(1700,'-90',14,154),(1701,'90',15,154),(1702,'0',16,154),(1703,'360',17,154),(1704,'4',18,154),(1705,'6,7,8',13,154),(1706,'NASA_MODIS',9,155),(1707,'clt',10,155),(1708,'200401',11,155),(1709,'200412',12,155),(1710,'-90',14,155),(1711,'90',15,155),(1712,'0',16,155),(1713,'360',17,155),(1714,'0',18,155),(1715,'1,2,3,4,5,6,7,8,9,10,11,12',13,155),(1716,'NASA_MODIS',1,156),(1717,'clt',2,156),(1718,'200401',3,156),(1719,'200412',4,156),(1720,'1,2,3,4,5,6,7,8,9,10,11,12',5,156),(1721,'-90',6,156),(1722,'90',7,156),(1723,'0',8,156),(1724,'NASA_MODIS',1,157),(1725,'clt',2,157),(1726,'200401',3,157),(1727,'200412',4,157),(1728,'1,2,3,4,5,6,7,8,9,10,11,12',5,157),(1729,'-90',6,157),(1730,'90',7,157),(1731,'0',8,157),(1732,'NASA_MODIS',1,158),(1733,'clt',2,158),(1734,'200401',3,158),(1735,'200412',4,158),(1736,'1,2,3,4,5,6,7,8,9,10,11,12',5,158),(1737,'-90',6,158),(1738,'90',7,158),(1739,'0',8,158),(1740,'NASA_MODIS',1,159),(1741,'clt',2,159),(1742,'200401',3,159),(1743,'200412',4,159),(1744,'1,2,3,4,5,6,7,8,9,10,11,12',5,159),(1745,'-90',6,159),(1746,'90',7,159),(1747,'0',8,159),(1748,'NASA_MODIS',1,160),(1749,'clt',2,160),(1750,'200401',3,160),(1751,'200412',4,160),(1752,'1,2,3,4,5,6,7,8,9,10,11,12',5,160),(1753,'-90',6,160),(1754,'90',7,160),(1755,'0',8,160),(1756,'NASA_MODIS',1,161),(1757,'clt',2,161),(1758,'200401',3,161),(1759,'200412',4,161),(1760,'1,2,3,4,5,6,7,8,9,10,11,12',5,161),(1761,'-90',6,161),(1762,'90',7,161),(1763,'0',8,161),(1764,'NASA_MODIS',1,162),(1765,'clt',2,162),(1766,'200401',3,162),(1767,'200412',4,162),(1768,'1,2,3,4,5,6,7,8,9,10,11,12',5,162),(1769,'-90',6,162),(1770,'90',7,162),(1771,'0',8,162),(1772,'NASA_MODIS',1,163),(1773,'clt',2,163),(1774,'200401',3,163),(1775,'200412',4,163),(1776,'1,2,3,4,5,6,7,8,9,10,11,12',5,163),(1777,'-90',6,163),(1778,'90',7,163),(1779,'0',8,163),(1780,'NASA_MODIS',1,164),(1781,'clt',2,164),(1782,'200401',3,164),(1783,'200412',4,164),(1784,'1,2,3,4,5,6,7,8,9,10,11,12',5,164),(1785,'-90',6,164),(1786,'90',7,164),(1787,'0',8,164),(1788,'cccma_canesm2',59,165),(1789,'cccma_canesm2',60,165),(1790,'pr',61,165),(1791,'pr',62,165),(1792,'',63,165),(1793,'',64,165),(1794,'200401',65,165),(1795,'200412',66,165),(1796,'0',67,165),(1797,'360',68,165),(1798,'-90',69,165),(1799,'90',70,165),(1800,'500',71,165),(1801,'NASA_AMSRE',1,166),(1802,'tos',2,166),(1803,'200301',3,166),(1804,'200312',4,166),(1805,'6,7,8',5,166),(1806,'0',6,166),(1807,'180',7,166),(1808,'2',8,166),(1809,'NASA_MODIS',1,167),(1810,'clt',2,167),(1811,'200401',3,167),(1812,'200412',4,167),(1813,'1,2,3,4,5,6,7,8,9,10,11,12',5,167),(1814,'-90',6,167),(1815,'90',7,167),(1816,'0',8,167),(1817,'CCCMA_CANESM2',28,168),(1818,'hus',29,168),(1819,'200301',30,168),(1820,'200312',31,168),(1821,'40000',32,168),(1822,'90',33,168),(1823,'270',34,168),(1824,'0',35,168),(1825,'180',36,168),(1826,'6,7,8',37,168),(1827,'4',38,168),(1828,'NASA_MLS',49,169),(1829,'hus',50,169),(1830,'200301',51,169),(1831,'200312',52,169),(1832,'90',53,169),(1833,'270',54,169),(1834,'0',55,169),(1835,'180',56,169),(1836,'6,7,8',57,169),(1837,'1',58,169),(1838,'NASA_MLS',49,170),(1839,'hus',50,170),(1840,'200501',51,170),(1841,'200512',52,170),(1842,'90',53,170),(1843,'270',54,170),(1844,'0',55,170),(1845,'180',56,170),(1846,'6,7,8',57,170),(1847,'1',58,170),(1848,'cccma_canesm2',59,171),(1849,'cccma_canesm2',60,171),(1850,'pr',61,171),(1851,'pr',62,171),(1852,'',63,171),(1853,'',64,171),(1854,'200401',65,171),(1855,'200412',66,171),(1856,'0',67,171),(1857,'360',68,171),(1858,'-90',69,171),(1859,'90',70,171),(1860,'500',71,171),(1861,'cccma_canesm2',59,172),(1862,'cccma_canesm2',60,172),(1863,'pr',61,172),(1864,'pr',62,172),(1865,'',63,172),(1866,'',64,172),(1867,'200401',65,172),(1868,'200412',66,172),(1869,'0',67,172),(1870,'360',68,172),(1871,'-90',69,172),(1872,'90',70,172),(1873,'5000',71,172),(1874,'NASA_MODIS',9,173),(1875,'clt',10,173),(1876,'200401',11,173),(1877,'200412',12,173),(1878,'-90',14,173),(1879,'90',15,173),(1880,'0',16,173),(1881,'360',17,173),(1882,'0',18,173),(1883,'1,2,3,4,5,6,7,8,9,10,11,12',13,173),(1884,'NASA_MODIS',9,174),(1885,'clt',10,174),(1886,'',11,174),(1887,'',12,174),(1888,'',14,174),(1889,'',15,174),(1890,'',16,174),(1891,'',17,174),(1892,'4',18,174),(1893,'3,4,5,6,7,8,9,10,11,12',13,174),(1894,'NASA_MODIS',9,175),(1895,'clt',10,175),(1896,'',11,175),(1897,'',12,175),(1898,'',14,175),(1899,'',15,175),(1900,'',16,175),(1901,'',17,175),(1902,'4',18,175),(1903,'3,4,8,9,10,11,12',13,175),(1904,'NASA_MODIS',9,176),(1905,'clt',10,176),(1906,'',11,176),(1907,'',12,176),(1908,'',14,176),(1909,'',15,176),(1910,'',16,176),(1911,'',17,176),(1912,'4',18,176),(1913,'3,4,5',13,176),(1914,'NASA_MODIS',9,177),(1915,'clt',10,177),(1916,'200401',11,177),(1917,'200412',12,177),(1918,'-90',14,177),(1919,'90',15,177),(1920,'0',16,177),(1921,'360',17,177),(1922,'0',18,177),(1923,'1,2,3,4,5,6,7,8,9,10,11,12',13,177),(1924,'NASA_MODIS',9,178),(1925,'clt',10,178),(1926,'200401',11,178),(1927,'200412',12,178),(1928,'-90',14,178),(1929,'90',15,178),(1930,'0',16,178),(1931,'360',17,178),(1932,'0',18,178),(1933,'1,2,3,4,5,6,7,8,9,10,11,12',13,178),(1934,'NASA_MODIS',9,179),(1935,'clt',10,179),(1936,'200401',11,179),(1937,'200412',12,179),(1938,'-90',14,179),(1939,'90',15,179),(1940,'0',16,179),(1941,'360',17,179),(1942,'0',18,179),(1943,'1,2,3,4,5,6,7,8,9,10,11,12',13,179),(1944,'NASA_MODIS',9,180),(1945,'clt',10,180),(1946,'200401',11,180),(1947,'200412',12,180),(1948,'-90',14,180),(1949,'90',15,180),(1950,'0',16,180),(1951,'360',17,180),(1952,'0',18,180),(1953,'1,2,3,4,5,6,7,8,9,10,11,12',13,180),(1954,'NASA_MODIS',9,181),(1955,'clt',10,181),(1956,'200401',11,181),(1957,'200412',12,181),(1958,'-90',14,181),(1959,'90',15,181),(1960,'0',16,181),(1961,'360',17,181),(1962,'0',18,181),(1963,'1,2,3,4,5,6,7,8,9,10,11,12',13,181),(1964,'NASA_MODIS',9,182),(1965,'clt',10,182),(1966,'200401',11,182),(1967,'200412',12,182),(1968,'-90',14,182),(1969,'90',15,182),(1970,'0',16,182),(1971,'360',17,182),(1972,'0',18,182),(1973,'1,2,3,4,5,6,7,8,9,10,11,12',13,182),(1974,'NASA_MODIS',9,183),(1975,'clt',10,183),(1976,'200401',11,183),(1977,'200412',12,183),(1978,'-90',14,183),(1979,'90',15,183),(1980,'0',16,183),(1981,'360',17,183),(1982,'0',18,183),(1983,'1,2,3,4,5,6,7,8,9,10,11,12',13,183),(1984,'NASA_MODIS',9,184),(1985,'clt',10,184),(1986,'200401',11,184),(1987,'200412',12,184),(1988,'-90',14,184),(1989,'90',15,184),(1990,'0',16,184),(1991,'360',17,184),(1992,'0',18,184),(1993,'1,2,3,4,5,6,7,8,9,10,11,12',13,184),(1994,'NASA_MODIS',9,185),(1995,'clt',10,185),(1996,'200401',11,185),(1997,'200412',12,185),(1998,'-90',14,185),(1999,'90',15,185),(2000,'0',16,185),(2001,'360',17,185),(2002,'0',18,185),(2003,'1,2,3,4,5,6,7,8,9,10,11,12',13,185),(2004,'NASA_MODIS',9,186),(2005,'clt',10,186),(2006,'200401',11,186),(2007,'200412',12,186),(2008,'-90',14,186),(2009,'90',15,186),(2010,'0',16,186),(2011,'360',17,186),(2012,'0',18,186),(2013,'1,2,3,4,5,6,7,8,9,10,11,12',13,186),(2014,'NASA_AIRS',28,187),(2015,'ta',29,187),(2016,'200401',30,187),(2017,'200412',31,187),(2018,'50000',32,187),(2019,'0',33,187),(2020,'360',34,187),(2021,'-90',35,187),(2022,'90',36,187),(2023,'1,2,3,4,5,6,7,8,9,10,11,12',37,187),(2024,'0',38,187),(2025,'0',8,219),(2026,'-90',6,219),(2027,'200412',4,219),(2028,'90',7,219),(2029,'clt',2,219),(2030,'NASA_MODIS',1,219),(2031,'1,2,3,4,5,6,7,8,9,10,11,12',5,219),(2032,'200401',3,219),(2033,'0',8,221),(2034,'-90',6,221),(2035,'200412',4,221),(2036,'90',7,221),(2037,'clt',2,221),(2038,'NASA_MODIS',1,221),(2039,'1,2,3,4,5,6,7,8,9,10,11,12',5,221),(2040,'200401',3,221),(2041,'0',8,223),(2042,'-90',6,223),(2043,'200412',4,223),(2044,'90',7,223),(2045,'clt',2,223),(2046,'NASA_MODIS',1,223),(2047,'1,2,3,4,5,6,7,8,9,10,11,12',5,223),(2048,'200401',3,223),(2049,'pr',61,229),(2050,'pr',62,229),(2051,'pr',74,230),(2052,'pr',75,230),(2053,'-1',98,231),(2054,'1,2,3,4,5,6,7,8,9,10,11,12',96,231),(2055,'pr',86,231),(2056,'200412',91,231),(2057,'pr',87,231),(2058,'0',8,232),(2059,'-90',6,232),(2060,'200412',4,232),(2061,'90',7,232),(2062,'clt',2,232),(2063,'NASA_MODIS',1,232),(2064,'1,2,3,4,5,6,7,8,9,10,11,12',5,232),(2065,'200401',3,232),(2066,'0',8,233),(2067,'-90',6,233),(2068,'200412',4,233),(2069,'90',7,233),(2070,'clt',2,233),(2071,'NASA_MODIS',1,233),(2072,'1,2,3,4,5,6,7,8,9,10,11,12',5,233),(2073,'200401',3,233),(2076,'200401',21,235),(2077,'clt',20,235),(2078,'200401',30,236),(2079,'ta',29,236),(2080,'200401',41,237),(2081,'200401',41,238),(2082,'200401',41,239),(2083,'2',48,240),(2084,'-90',43,240),(2085,'200412',42,240),(2086,'90',44,240),(2087,'ta',40,240),(2088,'90000',46,240),(2089,'NASA_AIRS',39,240),(2090,'1,2,3,4,5,6,7,8,9,10,11,12',47,240),(2091,'20000',45,240),(2092,'200401',41,240),(2093,'200401',11,241),(2094,'clt',10,241),(2095,'0',16,242),(2096,'1,2,3,4,5,6,7,8,9,10,11,12',13,242),(2097,'-90',14,242),(2098,'200412',12,242),(2099,'90',15,242),(2100,'clt',10,242),(2101,'NASA_MODIS',9,242),(2102,'360',17,242),(2103,'200401',11,242),(2104,'0',18,242),(2105,'0',23,243),(2106,'0',27,243),(2107,'-90',25,243),(2108,'200412',22,243),(2109,'90',26,243),(2110,'clt',20,243),(2111,'NASA_MODIS',19,243),(2112,'360',24,243),(2113,'200401',21,243),(2114,'200401',30,244),(2115,'ta',29,244),(2116,'50000',32,244),(2117,'0',38,244),(2118,'-90',35,244),(2119,'200412',31,244),(2120,'90',36,244),(2121,'1,2,3,4,5,6,7,8,9,10,11,12',37,244),(2122,'0',33,244),(2123,'NASA_AIRS',28,244),(2124,'360',34,244),(2125,'200401',30,245),(2126,'ta',29,245),(2127,'50000',32,245),(2128,'0',38,245),(2129,'-90',35,245),(2130,'200412',31,245),(2131,'90',36,245),(2132,'1,2,3,4,5,6,7,8,9,10,11,12',37,245),(2133,'0',33,245),(2134,'NASA_AIRS',28,245),(2135,'360',34,245),(2136,'0',53,246),(2137,'1,2,3,4,5,6,7,8,9,10,11,12',57,246),(2138,'-90',55,246),(2139,'200412',52,246),(2140,'90',56,246),(2141,'ta',50,246),(2142,'NASA_AIRS',49,246),(2143,'360',54,246),(2144,'200401',51,246),(2145,'2',58,246),(2146,'pr',61,247),(2147,'pr',62,247),(2148,'cccma_canesm2',60,247),(2149,'cccma_canesm2',59,247),(2150,'200401',65,247),(2151,'pr',61,248),(2152,'pr',62,248),(2153,'cccma_canesm2',60,248),(2154,'cccma_canesm2',59,248),(2155,'200401',65,248),(2156,'N/A',64,248),(2157,'N/A',63,248),(2158,'-90',69,248),(2159,'200412',66,248),(2160,'90',70,248),(2161,'500',71,248),(2162,'0',67,248),(2163,'360',68,248),(2164,'pr',74,249),(2165,'pr',75,249),(2166,'cccma_canesm2',73,249),(2167,'cccma_canesm2',72,249),(2168,'200401',78,249),(2169,'-1',98,250),(2170,'1,2,3,4,5,6,7,8,9,10,11,12',96,250),(2171,'pr',86,250),(2172,'200412',91,250),(2173,'pr',87,250),(2174,'cccma_canesm2',85,250),(2175,'cccma_canesm2',84,250),(2176,'90',95,250),(2177,'200401',90,250),(2178,'-90',94,250),(2179,'-100',100,250),(2180,'0',101,250),(2181,'-1',99,250),(2182,'0',92,250),(2183,'-1',98,251),(2184,'1,2,3,4,5,6,7,8,9,10,11,12',96,251),(2185,'pr',86,251),(2186,'200412',91,251),(2187,'pr',87,251),(2188,'cccma_canesm2',85,251),(2189,'cccma_canesm2',84,251),(2190,'90',95,251),(2191,'200401',90,251),(2192,'-90',94,251),(2193,'-100',100,251),(2194,'0',101,251),(2195,'-1',99,251),(2196,'0',92,251),(2197,'-1',89,251),(2198,'-1',88,251),(2199,'360',93,251),(2200,'-1',97,251),(2201,'pr',74,252),(2202,'pr',75,252),(2203,'cccma_canesm2',73,252),(2204,'cccma_canesm2',72,252),(2205,'200401',78,252),(2206,'N/A',77,252),(2207,'N/A',76,252),(2208,'-90',82,252),(2209,'200412',79,252),(2210,'90',83,252),(2211,'0',80,252),(2212,'360',81,252),(2213,'-1',98,253),(2214,'1,2,3,4,5,6,7,8,9,10,11,12',96,253),(2215,'pr',86,253),(2216,'200412',91,253),(2217,'pr',87,253),(2218,'cccma_canesm2',85,253),(2219,'cccma_canesm2',84,253),(2220,'90',95,253),(2221,'200401',90,253),(2222,'-90',94,253),(2223,'-100',100,253),(2224,'0',101,253),(2225,'-1',99,253),(2226,'0',92,253),(2227,'-1',89,253),(2228,'-1',88,253),(2229,'360',93,253),(2230,'-1',97,253),(2231,'pr',61,254),(2232,'pr',62,254),(2233,'cccma_canesm2',60,254),(2234,'cccma_canesm2',59,254),(2235,'200401',65,254),(2236,'N/A',64,254),(2237,'N/A',63,254),(2238,'-90',69,254),(2239,'200412',66,254),(2240,'90',70,254),(2241,'500',71,254),(2242,'0',67,254),(2243,'360',68,254),(2244,'0',16,255),(2245,'1,2,3,4,5,6,7,8,9,10,11,12',13,255),(2246,'-90',14,255),(2247,'200412',12,255),(2248,'90',15,255),(2249,'clt',10,255),(2250,'NASA_MODIS',9,255),(2251,'360',17,255),(2252,'200401',11,255),(2253,'0',18,255),(2254,'0',16,256),(2255,'1,2,3,4,5,6,7,8,9,10,11,12',13,256),(2256,'-90',14,256),(2257,'200412',12,256),(2258,'90',15,256),(2259,'clt',10,256),(2260,'NASA_MODIS',9,256),(2261,'360',17,256),(2262,'200401',11,256),(2263,'0',18,256),(2264,'0',16,257),(2265,'1,2,3,4,5,6,7,8,9,10,11,12',13,257),(2266,'-90',14,257),(2267,'200412',12,257),(2268,'90',15,257),(2269,'clt',10,257),(2270,'NASA_MODIS',9,257),(2271,'360',17,257),(2272,'200401',11,257),(2273,'0',18,257),(2274,'0',16,258),(2275,'1,2,3,4,5,6,7,8,9,10,11,12',13,258),(2276,'-90',14,258),(2277,'200412',12,258),(2278,'90',15,258),(2279,'clt',10,258),(2280,'NASA_MODIS',9,258),(2281,'360',17,258),(2282,'200401',11,258),(2283,'0',18,258),(2284,'0',23,259),(2285,'0',27,259),(2286,'-90',25,259),(2287,'200412',22,259),(2288,'90',26,259),(2289,'clt',20,259),(2290,'NASA_MODIS',19,259),(2291,'360',24,259),(2292,'200401',21,259),(2293,'2',48,260),(2294,'-90',43,260),(2295,'200412',42,260),(2296,'90',44,260),(2297,'ta',40,260),(2298,'90000',46,260),(2299,'NASA_AIRS',39,260),(2300,'1,2,3,4,5,6,7,8,9,10,11,12',47,260),(2301,'20000',45,260),(2302,'200401',41,260),(2316,'pr',61,262),(2317,'pr',62,262),(2318,'cccma_canesm2',60,262),(2319,'cccma_canesm2',59,262),(2320,'200401',65,262),(2321,'N/A',64,262),(2322,'N/A',63,262),(2323,'-90',69,262),(2324,'200412',66,262),(2325,'90',70,262),(2326,'500',71,262),(2327,'0',67,262),(2328,'360',68,262),(2329,'pr',61,263),(2330,'pr',62,263),(2331,'cccma_canesm2',60,263),(2332,'cccma_canesm2',59,263),(2333,'200401',65,263),(2334,'N/A',64,263),(2335,'N/A',63,263),(2336,'-90',69,263),(2337,'200412',66,263),(2338,'90',70,263),(2339,'500',71,263),(2340,'0',67,263),(2341,'360',68,263),(2342,'0',16,264),(2343,'1,2,3,4,5,6,7,8,9,10,11,12',13,264),(2344,'-90',14,264),(2345,'200412',12,264),(2346,'90',15,264),(2347,'clt',10,264),(2348,'NASA_MODIS',9,264),(2349,'360',17,264),(2350,'200401',11,264),(2351,'0',18,264),(2352,'0',16,265),(2353,'1,2,3,4,5,6,7,8,9,10,11,12',13,265),(2354,'-90',14,265),(2355,'200412',12,265),(2356,'90',15,265),(2357,'clt',10,265),(2358,'NASA_MODIS',9,265),(2359,'360',17,265),(2360,'200401',11,265),(2361,'0',18,265),(2362,'0',16,266),(2363,'1,2,3,4,5,6,7,8,9,10,11,12',13,266),(2364,'-90',14,266),(2365,'200412',12,266),(2366,'90',15,266),(2367,'clt',10,266),(2368,'NASA_MODIS',9,266),(2369,'360',17,266),(2370,'200401',11,266),(2371,'0',18,266),(2372,'0',8,267),(2373,'-90',6,267),(2374,'200412',4,267),(2375,'90',7,267),(2376,'clt',2,267),(2377,'NASA_MODIS',1,267),(2378,'1,2,3,4,5,6,7,8,9,10,11,12',5,267),(2379,'200401',3,267),(2380,'0',8,268),(2381,'-90',6,268),(2382,'200412',4,268),(2383,'90',7,268),(2384,'clt',2,268),(2385,'NASA_MODIS',1,268),(2386,'1,2,3,4,5,6,7,8,9,10,11,12',5,268),(2387,'200401',3,268),(2388,'0',23,269),(2389,'0',27,269),(2390,'-90',25,269),(2391,'200412',22,269),(2392,'90',26,269),(2393,'clt',20,269),(2394,'NASA_MODIS',19,269),(2395,'360',24,269),(2396,'200401',21,269),(2397,'0',23,270),(2398,'0',27,270),(2399,'-90',25,270),(2400,'200412',22,270),(2401,'90',26,270),(2402,'clt',20,270),(2403,'NASA_MODIS',19,270),(2404,'360',24,270),(2405,'200401',21,270),(2406,'200401',30,271),(2407,'ta',29,271),(2408,'50000',32,271),(2409,'0',38,271),(2410,'-90',35,271),(2411,'200412',31,271),(2412,'90',36,271),(2413,'1,2,3,4,5,6,7,8,9,10,11,12',37,271),(2414,'0',33,271),(2415,'NASA_AIRS',28,271),(2416,'360',34,271),(2417,'200401',30,272),(2418,'ta',29,272),(2419,'50000',32,272),(2420,'0',38,272),(2421,'-90',35,272),(2422,'200412',31,272),(2423,'90',36,272),(2424,'1,2,3,4,5,6,7,8,9,10,11,12',37,272),(2425,'0',33,272),(2426,'NASA_AIRS',28,272),(2427,'360',34,272),(2428,'0',8,273),(2429,'-90',6,273),(2430,'200412',4,273),(2431,'90',7,273),(2432,'clt',2,273),(2433,'NASA_MODIS',1,273),(2434,'1,2,3,4,5,6,7,8,9,10,11,12',5,273),(2435,'200401',3,273),(2436,'200401',30,274),(2437,'ta',29,274),(2438,'NaN',32,274),(2439,'0',38,274),(2440,'-90',35,274),(2441,'200412',31,274),(2442,'90',36,274),(2443,'1,2,3,4,5,6,7,8,9,10,11,12',37,274),(2444,'0',33,274),(2445,'NASA_AIRS',28,274),(2446,'',34,274),(2447,'200401',30,275),(2448,'ta',29,275),(2449,'50000',32,275),(2450,'0',38,275),(2451,'-90',35,275),(2452,'200412',31,275),(2453,'90',36,275),(2454,'1,2,3,4,5,6,7,8,9,10,11,12',37,275),(2455,'0',33,275),(2456,'NASA_AIRS',28,275),(2457,'360',34,275),(2458,'0',8,276),(2459,'-90',6,276),(2460,'200412',4,276),(2461,'90',7,276),(2462,'clt',2,276),(2463,'NASA_MODIS',1,276),(2464,'1,2,3,4,5,6,7,8,9,10,11,12',5,276),(2465,'200401',3,276),(2466,'0',8,277),(2467,'-90',6,277),(2468,'200412',4,277),(2469,'90',7,277),(2470,'clt',2,277),(2471,'NASA_MODIS',1,277),(2472,'1,2,3,4,5,6,7,8,9,10,11,12',5,277),(2473,'200401',3,277),(2474,'0',53,278),(2475,'1,2,3,4,5,6,7,8,9,10,11,12',57,278),(2476,'-90',55,278),(2477,'200412',52,278),(2478,'90',56,278),(2479,'ta',50,278),(2480,'NASA_AIRS',49,278),(2481,'360',54,278),(2482,'200401',51,278),(2483,'2',58,278),(2484,'0',53,279),(2485,'1,2,3,4,5,6,7,8,9,10,11,12',57,279),(2486,'-90',55,279),(2487,'200412',52,279),(2488,'90',56,279),(2489,'ta',50,279),(2490,'NASA_AIRS',49,279),(2491,'360',54,279),(2492,'200401',51,279),(2493,'3',58,279),(2494,'pr',61,280),(2495,'pr',62,280),(2496,'cccma_canesm2',60,280),(2497,'cccma_canesm2',59,280),(2498,'200401',65,280),(2499,'N/A',64,280),(2500,'N/A',63,280),(2501,'-90',69,280),(2502,'200412',66,280),(2503,'90',70,280),(2504,'500',71,280),(2505,'0',67,280),(2506,'360',68,280),(2507,'pr',61,281),(2508,'pr',62,281),(2509,'cccma_canesm2',60,281),(2510,'cccma_canesm2',59,281),(2511,'200401',65,281),(2512,'N/A',64,281),(2513,'N/A',63,281),(2514,'-90',69,281),(2515,'200412',66,281),(2516,'',70,281),(2517,'',71,281),(2518,'',67,281),(2519,'',68,281),(2520,'pr',61,282),(2521,'pr',62,282),(2522,'cccma_canesm2',60,282),(2523,'cccma_canesm2',59,282),(2524,'200401',65,282),(2525,'N/A',64,282),(2526,'N/A',63,282),(2527,'-90',69,282),(2528,'200412',66,282),(2529,'',70,282),(2530,'',71,282),(2531,'',67,282),(2532,'',68,282),(2533,'pr',61,283),(2534,'pr',62,283),(2535,'cccma_canesm2',60,283),(2536,'cccma_canesm2',59,283),(2537,'200401',65,283),(2538,'N/A',64,283),(2539,'N/A',63,283),(2540,'-90',69,283),(2541,'200412',66,283),(2542,'',70,283),(2543,'',71,283),(2544,'',67,283),(2545,'',68,283),(2546,'pr',61,284),(2547,'pr',62,284),(2548,'cccma_canesm2',60,284),(2549,'cccma_canesm2',59,284),(2550,'200401',65,284),(2551,'N/A',64,284),(2552,'N/A',63,284),(2553,'-90',69,284),(2554,'200412',66,284),(2555,'',70,284),(2556,'',71,284),(2557,'',67,284),(2558,'',68,284),(2559,'200401',30,285),(2560,'ta',29,285),(2561,'50000',32,285),(2562,'0',38,285),(2563,'-90',35,285),(2564,'200412',31,285),(2565,'90',36,285),(2566,'1,2,3,4,5,6,7,8,9,10,11,12',37,285),(2567,'0',33,285),(2568,'NASA_AIRS',28,285),(2569,'360',34,285),(2570,'200401',30,286),(2571,'ta',29,286),(2572,'NaN',32,286),(2573,'0',38,286),(2574,'-90',35,286),(2575,'200412',31,286),(2576,'90',36,286),(2577,'1,2,3,4,5,6,7,8,9,10,11,12',37,286),(2578,'0',33,286),(2579,'NASA_AIRS',28,286),(2580,'360',34,286),(2581,'pr',61,287),(2582,'pr',62,287),(2583,'cccma_canesm2',60,287),(2584,'cccma_canesm2',59,287),(2585,'200401',65,287),(2586,'N/A',64,287),(2587,'N/A',63,287),(2588,'-90',69,287),(2589,'200412',66,287),(2590,'',70,287),(2591,'',71,287),(2592,'',67,287),(2593,'',68,287),(2594,'pr',61,288),(2595,'pr',62,288),(2596,'cccma_canesm2',60,288),(2597,'cccma_canesm2',59,288),(2598,'200401',65,288),(2599,'N/A',64,288),(2600,'N/A',63,288),(2601,'-90',69,288),(2602,'200412',66,288),(2603,'90',70,288),(2604,'500',71,288),(2605,'0',67,288),(2606,'360',68,288),(2607,'pr',61,289),(2608,'pr',62,289),(2609,'cccma_canesm2',60,289),(2610,'cccma_canesm2',59,289),(2611,'200401',65,289),(2612,'N/A',64,289),(2613,'N/A',63,289),(2614,'-90',69,289),(2615,'200412',66,289),(2616,'90',70,289),(2617,'500',71,289),(2618,'0',67,289),(2619,'360',68,289),(2620,'pr',61,290),(2621,'pr',62,290),(2622,'cccma_canesm2',60,290),(2623,'cccma_canesm2',59,290),(2624,'200401',65,290),(2625,'N/A',64,290),(2626,'N/A',63,290),(2627,'-90',69,290),(2628,'200412',66,290),(2629,'',70,290),(2630,'',71,290),(2631,'',67,290),(2632,'',68,290),(2633,'pr',61,291),(2634,'pr',62,291),(2635,'cccma_canesm2',60,291),(2636,'cccma_canesm2',59,291),(2637,'200401',65,291),(2638,'N/A',64,291),(2639,'N/A',63,291),(2640,'-90',69,291),(2641,'200412',66,291),(2642,'90',70,291),(2643,'500',71,291),(2644,'0',67,291),(2645,'360',68,291),(2646,'pr',74,292),(2647,'pr',75,292),(2648,'cccma_canesm2',73,292),(2649,'cccma_canesm2',72,292),(2650,'200401',78,292),(2651,'N/A',77,292),(2652,'N/A',76,292),(2653,'-90',82,292),(2654,'200412',79,292),(2655,'90',83,292),(2656,'0',80,292),(2657,'360',81,292),(2658,'pr',74,293),(2659,'pr',75,293),(2660,'cccma_canesm2',73,293),(2661,'cccma_canesm2',72,293),(2662,'200401',78,293),(2663,'N/A',77,293),(2664,'N/A',76,293),(2665,'-90',82,293),(2666,'200412',79,293),(2667,'',83,293),(2668,'',80,293),(2669,'',81,293),(2670,'-1',98,294),(2671,'1,2,3,4,5,6,7,8,9,10,11,12',96,294),(2672,'pr',86,294),(2673,'200412',91,294),(2674,'pr',87,294),(2675,'cccma_canesm2',85,294),(2676,'cccma_canesm2',84,294),(2677,'90',95,294),(2678,'200401',90,294),(2679,'-90',94,294),(2680,'-100',100,294),(2681,'0',101,294),(2682,'-1',99,294),(2683,'0',92,294),(2684,'-1',89,294),(2685,'-1',88,294),(2686,'360',93,294),(2687,'-1',97,294),(2688,'-1',98,295),(2689,'1,2,3,4,5,6,7,8,9,10,11,12',96,295),(2690,'pr',86,295),(2691,'200412',91,295),(2692,'pr',87,295),(2693,'cccma_canesm2',85,295),(2694,'cccma_canesm2',84,295),(2695,'90',95,295),(2696,'200401',90,295),(2697,'',94,295),(2698,'-100',100,295),(2699,'7',101,295),(2700,'',99,295),(2701,'',92,295),(2702,'-1',89,295),(2703,'-1',88,295),(2704,'',93,295),(2705,'',97,295),(2706,'0',16,296),(2707,'1,2,3,4,5,6,7,8,9,10,11,12',13,296),(2708,'-90',14,296),(2709,'201012',12,296),(2710,'90',15,296),(2711,'clt',10,296),(2712,'NASA_MODIS',9,296),(2713,'360',17,296),(2714,'200401',11,296),(2715,'0',18,296),(2716,'0',16,297),(2717,'1,2,3,4,5,6,7,8,9,10,11,12',13,297),(2718,'-90',14,297),(2719,'201012',12,297),(2720,'90',15,297),(2721,'clt',10,297),(2722,'NASA_MODIS',9,297),(2723,'360',17,297),(2724,'200401',11,297),(2725,'0',18,297),(2726,'pr',61,298),(2727,'pr',62,298),(2728,'cccma_canesm2',60,298),(2729,'cccma_canesm2',59,298),(2730,'200401',65,298),(2731,'N/A',64,298),(2732,'N/A',63,298),(2733,'-90',69,298),(2734,'200412',66,298),(2735,'90',70,298),(2736,'500',71,298),(2737,'0',67,298),(2738,'360',68,298),(2739,'-1',98,299),(2740,'1,2,3,4,5,6,7,8,9,10,11,12',96,299),(2741,'pr',86,299),(2742,'200412',91,299),(2743,'pr',87,299),(2744,'cccma_canesm2',85,299),(2745,'cccma_canesm2',84,299),(2746,'90',95,299),(2747,'200401',90,299),(2748,'-90',94,299),(2749,'-100',100,299),(2750,'0',101,299),(2751,'-1',99,299),(2752,'0',92,299),(2753,'-1',89,299),(2754,'-1',88,299),(2755,'360',93,299),(2756,'-1',97,299),(2757,'-1',98,300),(2758,'1,2,3,4,5,6,7,8,9,10,11,12',96,300),(2759,'pr',86,300),(2760,'200412',91,300),(2761,'pr',87,300),(2762,'cccma_canesm2',85,300),(2763,'cccma_canesm2',84,300),(2764,'90',95,300),(2765,'200401',90,300),(2766,'',94,300),(2767,'-100',100,300),(2768,'7',101,300),(2769,'',99,300),(2770,'',92,300),(2771,'-1',89,300),(2772,'-1',88,300),(2773,'',93,300),(2774,'',97,300),(2775,'-1',98,301),(2776,'1,2,3,4,5,6,7,8,9,10,11,12',96,301),(2777,'pr',86,301),(2778,'200412',91,301),(2779,'pr',87,301),(2780,'cccma_canesm2',85,301),(2781,'cccma_canesm2',84,301),(2782,'90',95,301),(2783,'200401',90,301),(2784,'-90',94,301),(2785,'-100',100,301),(2786,'0',101,301),(2787,'-1',99,301),(2788,'0',92,301),(2789,'-1',89,301),(2790,'-1',88,301),(2791,'360',93,301),(2792,'-1',97,301),(2793,'-1',98,302),(2794,'1,2,3,4,5,6,7,8,9,10,11,12',96,302),(2795,'pr',86,302),(2796,'200412',91,302),(2797,'pr',87,302),(2798,'cccma_canesm2',85,302),(2799,'cccma_canesm2',84,302),(2800,'90',95,302),(2801,'200401',90,302),(2802,'',94,302),(2803,'-100',100,302),(2804,'7',101,302),(2805,'',99,302),(2806,'',92,302),(2807,'-1',89,302),(2808,'-1',88,302),(2809,'',93,302),(2810,'',97,302),(2811,'-1',98,303),(2812,'1,2,3,4,5,6,7,8,9,10,11,12',96,303),(2813,'pr',86,303),(2814,'200412',91,303),(2815,'pr',87,303),(2816,'cccma_canesm2',85,303),(2817,'cccma_canesm2',84,303),(2818,'90',95,303),(2819,'200401',90,303),(2820,'',94,303),(2821,'-100',100,303),(2822,'0',101,303),(2823,'-1',99,303),(2824,'',92,303),(2825,'-1',89,303),(2826,'-1',88,303),(2827,'360',93,303),(2828,'-1',97,303),(2829,'0',16,304),(2830,'1,2,3,4,5,6,7,8,9,10,11,12',13,304),(2831,'-90',14,304),(2832,'200412',12,304),(2833,'90',15,304),(2834,'clt',10,304),(2835,'NASA_MODIS',9,304),(2836,'360',17,304),(2837,'200401',11,304),(2838,'0',18,304),(2839,'2',48,305),(2840,'-90',43,305),(2841,'200412',42,305),(2842,'90',44,305),(2843,'ta',40,305),(2844,'90000',46,305),(2845,'NASA_AIRS',39,305),(2846,'1,2,3,4,5,6,7,8,9,10,11,12',47,305),(2847,'20000',45,305),(2848,'200401',41,305),(2849,'0',53,306),(2850,'1,2,3,4,5,6,7,8,9,10,11,12',57,306),(2851,'-90',55,306),(2852,'200412',52,306),(2853,'90',56,306),(2854,'ta',50,306),(2855,'NASA_AIRS',49,306),(2856,'360',54,306),(2857,'200401',51,306),(2858,'2',58,306),(2859,'pr',74,307),(2860,'pr',75,307),(2861,'cccma_canesm2',73,307),(2862,'cccma_canesm2',72,307),(2863,'200401',78,307),(2864,'N/A',77,307),(2865,'N/A',76,307),(2866,'-90',82,307),(2867,'200412',79,307),(2868,'90',83,307),(2869,'0',80,307),(2870,'360',81,307),(2871,'-1',98,308),(2872,'1,2,3,4,5,6,7,8,9,10,11,12',96,308),(2873,'pr',86,308),(2874,'200412',91,308),(2875,'pr',87,308),(2876,'cccma_canesm2',85,308),(2877,'cccma_canesm2',84,308),(2878,'90',95,308),(2879,'200401',90,308),(2880,'-90',94,308),(2881,'-100',100,308),(2882,'0',101,308),(2883,'-1',99,308),(2884,'0',92,308),(2885,'-1',89,308),(2886,'-1',88,308),(2887,'360',93,308),(2888,'-1',97,308),(2889,'0',16,309),(2890,'1,2,3,4,5,6,7,8,9,10,11,12',13,309),(2891,'-90',14,309),(2892,'200412',12,309),(2893,'90',15,309),(2894,'clt',10,309),(2895,'NASA_MODIS',9,309),(2896,'360',17,309),(2897,'200401',11,309),(2898,'0',18,309),(2899,'pr',74,310),(2900,'pr',75,310),(2901,'cccma_canesm2',73,310),(2902,'cccma_canesm2',72,310),(2903,'200401',78,310),(2904,'N/A',77,310),(2905,'N/A',76,310),(2906,'-90',82,310),(2907,'200412',79,310),(2908,'90',83,310),(2909,'0',80,310),(2910,'360',81,310),(2911,'0',16,311),(2912,'6,7,8',13,311),(2913,'-90',14,311),(2914,'200412',12,311),(2915,'90',15,311),(2916,'clt',10,311),(2917,'NASA_MODIS',9,311),(2918,'360',17,311),(2919,'200401',11,311),(2920,'0',18,311),(2921,'0',16,312),(2922,'6,7,8',13,312),(2923,'-90',14,312),(2924,'200412',12,312),(2925,'90',15,312),(2926,'clt',10,312),(2927,'NASA_MODIS',9,312),(2928,'360',17,312),(2929,'200401',11,312),(2930,'0',18,312),(2931,'0',16,313),(2932,'6,7,8',13,313),(2933,'-90',14,313),(2934,'200412',12,313),(2935,'90',15,313),(2936,'clt',10,313),(2937,'NASA_MODIS',9,313),(2938,'360',17,313),(2939,'200401',11,313),(2940,'0',18,313),(2941,'0',16,314),(2942,'6,7,8',13,314),(2943,'-90',14,314),(2944,'200412',12,314),(2945,'90',15,314),(2946,'clt',10,314),(2947,'NASA_MODIS',9,314),(2948,'360',17,314),(2949,'200401',11,314),(2950,'0',18,314),(2951,'-1',98,315),(2952,'1,2,3,4,5,6,7,8,9,10,11,12',96,315),(2953,'pr',86,315),(2954,'200412',91,315),(2955,'pr',87,315),(2956,'cccma_canesm2',85,315),(2957,'cccma_canesm2',84,315),(2958,'90',95,315),(2959,'200401',90,315),(2960,'',94,315),(2961,'-100',100,315),(2962,'7',101,315),(2963,'',99,315),(2964,'',92,315),(2965,'-1',89,315),(2966,'-1',88,315),(2967,'',93,315),(2968,'',97,315),(2969,'-1',98,316),(2970,'1,2,3,4,5,6,7,8,9,10,11,12',96,316),(2971,'pr',86,316),(2972,'200412',91,316),(2973,'pr',87,316),(2974,'cccma_canesm2',85,316),(2975,'cccma_canesm2',84,316),(2976,'90',95,316),(2977,'200401',90,316),(2978,'',94,316),(2979,'-100',100,316),(2980,'7',101,316),(2981,'',99,316),(2982,'',92,316),(2983,'-1',89,316),(2984,'-1',88,316),(2985,'',93,316),(2986,'',97,316),(2987,'-1',98,317),(2988,'1,2,3,4,5,6,7,8,9,10,11,12',96,317),(2989,'pr',86,317),(2990,'200412',91,317),(2991,'pr',87,317),(2992,'cccma_canesm2',85,317),(2993,'cccma_canesm2',84,317),(2994,'90',95,317),(2995,'200401',90,317),(2996,'-90',94,317),(2997,'-100',100,317),(2998,'0',101,317),(2999,'-1',99,317),(3000,'0',92,317),(3001,'-1',89,317),(3002,'-1',88,317),(3003,'360',93,317),(3004,'-1',97,317),(3005,'pr',74,318),(3006,'pr',75,318),(3007,'cccma_canesm2',73,318),(3008,'cccma_canesm2',72,318),(3009,'200401',78,318),(3010,'N/A',77,318),(3011,'N/A',76,318),(3012,'-90',82,318),(3013,'200412',79,318),(3014,'',83,318),(3015,'',80,318),(3016,'',81,318),(3017,'-1',98,319),(3018,'1,2,3,4,5,6,7,8,9,10,11,12',96,319),(3019,'pr',86,319),(3020,'200412',91,319),(3021,'pr',87,319),(3022,'cccma_canesm2',85,319),(3023,'cccma_canesm2',84,319),(3024,'90',95,319),(3025,'200401',90,319),(3026,'-90',94,319),(3027,'-100',100,319),(3028,'0',101,319),(3029,'-1',99,319),(3030,'0',92,319),(3031,'-1',89,319),(3032,'-1',88,319),(3033,'360',93,319),(3034,'-1',97,319),(3035,'-1',98,320),(3036,'1,2,3,4,5,6,7,8,9,10,11,12',96,320),(3037,'pr',86,320),(3038,'200412',91,320),(3039,'pr',87,320),(3040,'cccma_canesm2',85,320),(3041,'cccma_canesm2',84,320),(3042,'90',95,320),(3043,'200401',90,320),(3044,'',94,320),(3045,'-100',100,320),(3046,'7',101,320),(3047,'',99,320),(3048,'',92,320),(3049,'-1',89,320),(3050,'-1',88,320),(3051,'',93,320),(3052,'',97,320);
/*!40000 ALTER TABLE `ServiceConfigurationItem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ServiceExecutionLog`
--

DROP TABLE IF EXISTS `ServiceExecutionLog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ServiceExecutionLog` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dataUrl` varchar(255) DEFAULT NULL,
  `executionEndTime` datetime DEFAULT NULL,
  `executionStartTime` datetime DEFAULT NULL,
  `plotUrl` varchar(255) DEFAULT NULL,
  `purpose` varchar(255) DEFAULT NULL,
  `serviceId` bigint(20) NOT NULL,
  `serviceConfigurationId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) NOT NULL,
  `datasetStudyStartTime` datetime DEFAULT NULL,
  `datasetStudyEndTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_ly45hkuqs8yyw00iiuyx5hoj4` (`serviceId`),
  KEY `FK_g2n3b4rs0xys2r4r967uvi4jr` (`serviceConfigurationId`),
  KEY `FK_tloeyy4aa7n3jh3jcrbihp2wk` (`userId`),
  CONSTRAINT `FK_g2n3b4rs0xys2r4r967uvi4jr` FOREIGN KEY (`serviceConfigurationId`) REFERENCES `ServiceConfiguration` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `FK_ly45hkuqs8yyw00iiuyx5hoj4` FOREIGN KEY (`serviceId`) REFERENCES `ClimateService` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `FK_tloeyy4aa7n3jh3jcrbihp2wk` FOREIGN KEY (`userId`) REFERENCES `User` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=321 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ServiceExecutionLog`
--

LOCK TABLES `ServiceExecutionLog` WRITE;
/*!40000 ALTER TABLE `ServiceExecutionLog` DISABLE KEYS */;
INSERT INTO `ServiceExecutionLog` VALUES (1,'http://einstein.sv.cmu.edu:9002/static/scatterPlot2V/8c62940ce11322ac7cc96724f9bac9ec/data_compare.nc','2015-03-05 12:32:29','2015-03-05 12:32:23','http://einstein.sv.cmu.edu:9002/static/scatterPlot2V/8c62940ce11322ac7cc96724f9bac9ec/scatter.png','CCS student 1',7,1,2, null, null);
/*!40000 ALTER TABLE `ServiceExecutionLog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `User`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `User` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=91 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
INSERT INTO `User` VALUES (1,'admin','user'),(2,'CCS student 1',''),(3,'CCS student 1',''),(4,'CCS student 2',''),(5,'CCS student 1',''),(6,'CCS student 2',''),(7,'CCS student 3',''),(8,'CCS student 3',''),(9,'CCS student 4',''),(10,'CCS student 5',''),(11,'CCS student 7',''),(12,'CCS student 8',''),(13,'CCS student 9',''),(14,'CCS student 10',''),(15,'CCS student 10',''),(16,'CCS student 2',''),(17,'CCS student 2',''),(18,'CCS student 2',''),(19,'CCS student 2',''),(20,'CCS student 2',''),(21,'CCS student 2',''),(22,'CCS student 2',''),(23,'CCS student 1',''),(24,'CCS student 1',''),(25,'CCS student 10',''),(26,'CCS student 10',''),(27,'CCS student 10',''),(28,'CCS student 10',''),(29,'CCS student 2',''),(30,'CCS student 2',''),(31,'CCS student 2',''),(32,'CCS student 2',''),(33,'CCS student 2',''),(34,'CCS student 2',''),(35,'CCS student 2',''),(36,'CCS student 2',''),(37,'CCS student 2',''),(38,'CCS student 2',''),(39,'CCS student 2',''),(40,'CCS student 2',''),(41,'CCS student 2',''),(42,'CCS student 2',''),(43,'CCS student ',''),(44,'CCS student ',''),(45,'CCS student ',''),(46,'CCS student ',''),(47,'CCS student ',''),(48,'CCS student ',''),(49,'CCS student ',''),(50,'CCS student 2',''),(51,'CCS student 2',''),(52,'CCS student 2',''),(53,'CCS student 2',''),(54,'CCS student 2',''),(55,'CCS student 2',''),(56,'CCS student 2',''),(57,'CCS student 2',''),(58,'CCS student 2',''),(59,'CCS student ',''),(60,'CCS student ',''),(61,'CCS student 2',''),(62,'CCS student 10',''),(63,'CCS student 10',''),(64,'CCS student 2',''),(65,'CCS student 2',''),(66,'CCS student ',''),(67,'CCS student 2',''),(68,'CCS student 2',''),(69,'CCS student 2',''),(70,'CCS student 2',''),(71,'CCS student 2',''),(72,'CCS student 2',''),(73,'CCS student 2',''),(74,'CCS student 2',''),(75,'CCS student 2',''),(76,'CCS student 2',''),(77,'CCS student 2',''),(78,'CCS student 2',''),(79,'CCS student 2',''),(80,'CCS student 2',''),(81,'CCS student 1',''),(82,'CCS student 12',''),(83,'CCS student 1',''),(84,'CCS student 1',''),(85,'CCS student 123',''),(86,'CCS student 12',''),(87,'CCS student 12',''),(88,'CCS student 12',''),(89,'CCS student 12',''),(90,'CCS student 121','');
/*!40000 ALTER TABLE `User` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-04-14 14:45:59
