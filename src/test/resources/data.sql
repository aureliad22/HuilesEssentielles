DELETE FROM Huiles;
INSERT INTO `Huiles` (idHuile, nom_commun, nom_latin_genre, nom_latin_espece) VALUES (1,'Lavande fine','Lavandula','officinalis'),(2,'Menthe poivrée','Mentha','piperita'),(3,'Arbre à thé','Melaleuca','alternifolia');

DELETE FROM Pathologies;
INSERT INTO `Pathologies` (idPathologie, nom) VALUES (1,'Mycose cutanée'),(3,'Plaie'),(8,'Mal des transport');

DELETE FROM Precautions;
INSERT INTO `Precautions` (idPrecaution, libelle) VALUES (2,'Allergie à l\'un des composants'),(3,'Enfant < 7 ans'),(9,'Ne pas diffuser');

DELETE FROM Synergies;
INSERT INTO `Synergies` (idSynergie, nom, description) VALUES (2,'Contracture musculaire','3g Lavande fine + 3g Romarin 1,8 cinéole + 10g HV Macadamia, massage 3 fois par jour'),(3,'Mal des transports','1g Menthe poivrée + 1g Citron jaune, juste avant départ'),(4,'Mycose','1g Arbre à thé + 1g Géranium odorant + 5 g HV Calophylle, appliquer 2 fois par jour');

DELETE FROM Synonymes;
INSERT INTO `Synonymes` VALUES (1,'Blessure',3),(3,'Coupure',3),(4,'Cinétose',8);

DELETE FROM Pathologies_Huiles;
INSERT INTO `Pathologies_Huiles` VALUES (1,3),(3,1),(8,2);

DELETE FROM Precautions_Huiles;
INSERT INTO `Precautions_Huiles` VALUES (2,1),(3,1),(3,3),(9,2);

DELETE FROM Synergies_Huiles;
INSERT INTO `Synergies_Huiles` VALUES (2,1),(3,2),(4,3);

