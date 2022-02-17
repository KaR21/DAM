SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


CREATE TABLE IF NOT EXISTS `ikasle_skill` (
  `dni` varchar(9) NOT NULL,
  `kodea` varchar(2) NOT NULL,
  `urtea` int(11) NOT NULL,
  `nota` int(11) NOT NULL,
  PRIMARY KEY (`dni`,`kodea`,`urtea`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



INSERT INTO `ikasle_skill` (`dni`, `kodea`, `urtea`, `nota`) VALUES
('11111111A', '17', 2005, 4),
('22222222B', '19', 2005, 5),
('33333333C', '29', 2004, 6),
('44444444D', '12', 2004, 3),
('55555555E', '07', 2006, 4),
('77777777G', '05', 2006, 6),
('88888888H', '06', 2007, 7),
('99999999I', '04', 2007, 8),
('11111112K', '04', 2008, 6),
('11111113L', '12', 2008, 4),
('66666666F', '04', 2009, 4),
('22222222B', '06', 2009, 8),
('88888888H', '17', 2008, 7),
('11111113L', '17', 2007, 8),
('66666666F', '29', 2006, 3),
('11111111A', '29', 2003, 9),
('44444444D', '17', 2009, 6),
('66666666F', '12', 2005, 3),
('88888888H', '05', 2004, 5),
('22222222B', '17', 2009, 6),
('99999999I', '07', 2007, 7),
('11111112T', '19', 2006, 4),
('33333333C', '04', 2005, 7),
('11111111A', '05', 2009, 8),
('11111112T', '12', 2006, 6),
('33333333C', '17', 2008, 3),
('66666666F', '07', 2004, 7),
('11111113L', '29', 2006, 4);


CREATE TABLE IF NOT EXISTS `ikasleak` (
  `dni` varchar(9) NOT NULL,
  `izena` varchar(50) NOT NULL,
  `taldea` varchar(5) NOT NULL,
  `dni_tutorea` varchar(9) NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



INSERT INTO `ikasleak` (`dni`, `izena`, `taldea`, `dni_tutorea`) VALUES
('11111111A', 'Iratxe Lopez', 'SMR2A', '12345678B'),
('22222222B', 'Juan Martinez', 'ASI1', '23456789C'),
('33333333C', 'Manu Marquez', 'ASI1', '23456789C'),
('44444444D', 'Julian Robles', 'SMR2A', '12345678A'),
('55555555E', 'Ivan Murillo', 'SMR2D', '34567890E'),
('66666666F', 'Alexander Txopitea', 'ASI2', '45678901Z'),
('77777777G', 'Julen Lopez', 'ASI2', '45678901Z'),
('88888888H', 'Marta Irigoien', 'DAI2', '56789012G'),
('99999999I', 'Paco Soria', 'DAI2', '56789012G'),
('11111112T', 'Julia Perez', 'DAI2', '56789012G'),
('11111112K', 'Ricardo Montejo', 'SMR2D', '34567890E'),
('11111113L', 'Jose Luis Herran', 'ASI2', '45678901Z');

-- --------------------------------------------------------


CREATE TABLE IF NOT EXISTS `skills` (
  `kodea` varchar(2) NOT NULL,
  `deskribapena` varchar(50) NOT NULL,
  PRIMARY KEY (`kodea`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `skills` (`kodea`, `deskribapena`) VALUES
('04', 'Merkatronika'),
('05', 'CAD'),
('06', 'CNC Tornua'),
('07', 'CNC Fresa'),
('12', 'Alikatatua eta zola'),
('17', 'Web orrien diseinua'),
('19', 'Industria-kontrola'),
('29', 'Ile-apainketa');


CREATE TABLE IF NOT EXISTS `tutoreak` (
  `dni` varchar(9) NOT NULL,
  `izena` varchar(50) NOT NULL,
  `taldea` varchar(5) NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `tutoreak` (`dni`, `izena`, `taldea`) VALUES
('12345678A', 'Oier Arregi', 'SMR2A'),
('23456789C', 'Mikel Huerta', 'ASI1'),
('34567890E', 'Jose Antonio Goikoetxea', 'SMR2D'),
('45678901Z', 'Izaskun Kortabitarte', 'ASI2'),
('56789012G', 'Oskar Gisasola', 'DAI2');
