DROP TABLE Terminoak;
CREATE TABLE terminoak(
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    euskaraz VARCHAR(20),
    gazteleraz VARCHAR(20)
);
INSERT INTO Terminoak VALUES(null, "sagarra", "manzana");
INSERT INTO Terminoak (euskaraz, gazteleraz) VALUES("madaria", "pera");
INSERT INTO Terminoak (euskaraz, gazteleraz) VALUES("marrubia", "fresa");