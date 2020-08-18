CREATE TABLE `repo_default_fsentry` (
  `FSENTRY_PATH` text NOT NULL,
  `FSENTRY_NAME` varchar(255) NOT NULL,
  `FSENTRY_DATA` longblob,
  `FSENTRY_LASTMOD` bigint(20) NOT NULL,
  `FSENTRY_LENGTH` bigint(20) NOT NULL,
  UNIQUE KEY `REPO_DEFAULT_FSENTRY_IDX` (`FSENTRY_PATH`(245),`FSENTRY_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `repo_ds_datastore` (
  `ID` varchar(255) NOT NULL,
  `LENGTH` bigint(20) DEFAULT NULL,
  `LAST_MODIFIED` bigint(20) DEFAULT NULL,
  `DATA` longblob,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `repo_fsentry` (
  `FSENTRY_PATH` text NOT NULL,
  `FSENTRY_NAME` varchar(255) NOT NULL,
  `FSENTRY_DATA` longblob,
  `FSENTRY_LASTMOD` bigint(20) NOT NULL,
  `FSENTRY_LENGTH` bigint(20) NOT NULL,
  UNIQUE KEY `REPO_FSENTRY_IDX` (`FSENTRY_PATH`(245),`FSENTRY_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `repo_fsver_fsentry` (
  `FSENTRY_PATH` text NOT NULL,
  `FSENTRY_NAME` varchar(255) NOT NULL,
  `FSENTRY_DATA` longblob,
  `FSENTRY_LASTMOD` bigint(20) NOT NULL,
  `FSENTRY_LENGTH` bigint(20) NOT NULL,
  UNIQUE KEY `REPO_FSVER_FSENTRY_IDX` (`FSENTRY_PATH`(245),`FSENTRY_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `repo_pm_default_binval` (
  `BINVAL_ID` varchar(64) NOT NULL,
  `BINVAL_DATA` longblob NOT NULL,
  UNIQUE KEY `REPO_PM_DEFAULT_BINVAL_IDX` (`BINVAL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `repo_pm_default_bundle` (
  `NODE_ID` varbinary(16) NOT NULL,
  `BUNDLE_DATA` longblob NOT NULL,
  UNIQUE KEY `REPO_PM_DEFAULT_BUNDLE_IDX` (`NODE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `repo_pm_default_names` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `repo_pm_default_refs` (
  `NODE_ID` varbinary(16) NOT NULL,
  `REFS_DATA` longblob NOT NULL,
  UNIQUE KEY `REPO_PM_DEFAULT_REFS_IDX` (`NODE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `repo_ver_binval` (
  `BINVAL_ID` varchar(64) NOT NULL,
  `BINVAL_DATA` longblob NOT NULL,
  UNIQUE KEY `REPO_VER_BINVAL_IDX` (`BINVAL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `repo_ver_bundle` (
  `NODE_ID` varbinary(16) NOT NULL,
  `BUNDLE_DATA` longblob NOT NULL,
  UNIQUE KEY `REPO_VER_BUNDLE_IDX` (`NODE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `repo_ver_names` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `repo_ver_refs` (
  `NODE_ID` varbinary(16) NOT NULL,
  `REFS_DATA` longblob NOT NULL,
  UNIQUE KEY `REPO_VER_REFS_IDX` (`NODE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `journal_global_revision` (
  `REVISION_ID` bigint(20) NOT NULL,
  UNIQUE KEY `JOURNAL_GLOBAL_REVISION_IDX` (`REVISION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `journal_journal` (
  `REVISION_ID` bigint(20) NOT NULL,
  `JOURNAL_ID` varchar(255) DEFAULT NULL,
  `PRODUCER_ID` varchar(255) DEFAULT NULL,
  `REVISION_DATA` longblob,
  UNIQUE KEY `JOURNAL_JOURNAL_IDX` (`REVISION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `journal_local_revisions` (
  `JOURNAL_ID` varchar(255) NOT NULL,
  `REVISION_ID` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;