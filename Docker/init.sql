\c postgres

CREATE SEQUENCE KoffieSoorten_sequence
  start 1
  increment 1;
  
CREATE TABLE KoffieSoorten(
    id SERIAL PRIMARY KEY,
    soort varchar(255),
    name varchar(255),
    whereMade varchar(255),
    whenMade varchar(255),
    importantsIngredient varchar(255),
    meaning varchar(255)
);

INSERT INTO KoffieSoorten
    (id, name, soort, whereMade, whenMade, importantsIngredient, meaning)
VALUES
    (nextval('KoffieSoorten_sequence'), 'Espresso', 'PureVorm','Italië', '1900', 'Koffie', 'onder druk'),
    (nextval('KoffieSoorten_sequence'), 'Caffè americano', 'PureVorm','Europa', '1945', 'Water', 'Amerikaanse soldaten'),
    (nextval('KoffieSoorten_sequence'), 'Groene Koffie', 'PureVorm','Arabië', '1100', 'Groene bonen', 'Arabische Koffie'),
    (nextval('KoffieSoorten_sequence'), 'Marokkaanse Koffie', 'PureVorm','Marokko', '1900', 'Arabica koffiebonen', 'komt uit Marokko'),
    (nextval('KoffieSoorten_sequence'), 'Ristretto', 'PureVorm','Italië', '1952', 'Gekaramelliseerde suikers', 'Italiaans voor beperkt'),
    (nextval('KoffieSoorten_sequence'), 'Caffè lungo', 'PureVorm','Italië', '1941', 'Veel water', 'Italiaans voor lange koffie'),
    (nextval('KoffieSoorten_sequence'), 'Café liégeois ', 'IjsVorm','België', '1918', 'Karamel', 'Nederlands voor Luikse koffie'),
    (nextval('KoffieSoorten_sequence'), 'Frappé', 'IjsVorm','Thessaloniki in Griekenland', '1957', 'Gebroken ijs', 'Grieks voor geslagen'),
    (nextval('KoffieSoorten_sequence'), 'IJs koffie', 'IjsVorm','Italië', '1925', 'sterke koffie', 'Koffie met ijs'),
    (nextval('KoffieSoorten_sequence'), 'Shakerato', 'IjsVorm','Marokko', '1900', 'Arabica koffiebonen', ''),
    (nextval('KoffieSoorten_sequence'), 'Caffè latte', 'MelkEnRoomVorm','VS', '1995', 'Warme melk', 'Koffie met melk'),
    (nextval('KoffieSoorten_sequence'), 'Caffè macchiato', 'MelkEnRoomVorm','VS', '1995', 'Beetje melkschuim', 'Gevlekte koffie'),
    (nextval('KoffieSoorten_sequence'), 'Koffie verkeerd', 'MelkEnRoomVorm','Nederland', '1900', 'Veel warme melk', 'Veel melk'),
    (nextval('KoffieSoorten_sequence'), 'Cappuccino', 'MelkEnRoomVorm','Wenen', '1952', 'Melkschuim', 'Duits is het Kapuziner Kaffee'),
    (nextval('KoffieSoorten_sequence'), 'Wienermelange', 'MelkEnRoomVorm','Italië', '1941', 'veel soorten bonen', 'Bonenmelange'),
    (nextval('KoffieSoorten_sequence'), 'Einspänner', 'MelkEnRoomVorm','Wenen', '1945', 'dikke  laag slagroom', 'Eenspan, één paard'),
    (nextval('KoffieSoorten_sequence'), 'Caffè latte', 'MelkEnRoomVorm','VS', '1995', 'Warme melk', 'Koffie met melk'),
    (nextval('KoffieSoorten_sequence'), 'Caffè macchiato', 'MelkEnRoomVorm','VS', '1995', 'Beetje melkschuim', 'Gevlekte koffie'),
    (nextval('KoffieSoorten_sequence'), 'Koffie verkeerd', 'MelkEnRoomVorm','Nederland', '1900', 'Veel warme melk', 'Veel melk'),
    (nextval('KoffieSoorten_sequence'), 'Cappuccino', 'MelkEnRoomVorm','Wenen', '1952', 'Melkschuim', 'Duits is het Kapuziner Kaffee'),
    (nextval('KoffieSoorten_sequence'), 'Wienermelange', 'MelkEnRoomVorm','Italië', '1941', 'veel soorten bonen', 'Bonenmelange'),
    (nextval('KoffieSoorten_sequence'), 'Einspänner', 'MelkEnRoomVorm','Wenen', '1945', 'dikke  laag slagroom', 'Eenspan, één paard'),
    (nextval('KoffieSoorten_sequence'), 'Barraquito', 'AlcoholischeVorm','Spanje', '1900', 'laag gecondenseerde melk', ''),
    (nextval('KoffieSoorten_sequence'), 'Carajillo', 'AlcoholischeVorm','Spanje', '1945', 'Tia Maria', ''),
    (nextval('KoffieSoorten_sequence'), 'Dokkumer koffie', 'AlcoholischeVorm','Friesland', '', 'Sheut beerenburg', 'Oorspronkelijk met de Dokkumer Sonnema Berenburg en Friese stad Dokkum'),
    (nextval('KoffieSoorten_sequence'), 'French coffee', 'AlcoholischeVorm','Frankrijk', '', 'een scheut Grand Marnier of Cointreau-likeur', 'Franse koffie'),
    (nextval('KoffieSoorten_sequence'), 'Hasseltse koffie', 'AlcoholischeVorm','België', '', 'Jenever', 'komt uit belgië'),
    (nextval('KoffieSoorten_sequence'), 'Irish coffee', 'AlcoholischeVorm','Ierland', '1942', 'Bruine basterdsuiker', 'komt uit Ierland'),
    (nextval('KoffieSoorten_sequence'), 'Italian coffee', 'AlcoholischeVorm','Italië', '', 'amaretto', 'komt uit Italië'),
    (nextval('KoffieSoorten_sequence'), 'Limburgse koffie', 'AlcoholischeVorm','Limburg', '', 'Gember', 'komt uit Limburg'),
    (nextval('KoffieSoorten_sequence'), 'Pharisäer', 'AlcoholischeVorm','Noord-Friesland', '', 'Rum', 'jullie Farizeeën'),
    (nextval('KoffieSoorten_sequence'), 'Ponce', 'AlcoholischeVorm','Livorno Italië', '', 'Rum', ''),
    (nextval('KoffieSoorten_sequence'), 'Yuengyueng', 'TheeVorm','Hong-Kong', '2010', 'Melkthee', 'Koffie met thee'),
    (nextval('KoffieSoorten_sequence'), 'Backwoods Twisted Palm Tree', 'TheeVorm','Europa', '1960', '', ''),
    (nextval('KoffieSoorten_sequence'), 'Noorse eierKoffie', 'EiVorm','Noorwegen', '1910', 'Rauw ei', 'komt uit Noorwegen'),
    (nextval('KoffieSoorten_sequence'), 'Vietnamese eierkoffie', 'EiVorm','Vietnam', '1918', '2 eierdooiers', 'komt uit Vietnam'),
    (nextval('KoffieSoorten_sequence'), 'Zweedse eierKoffie', 'EiVorm','Zweden', '1910', 'Rauw ei', 'komt uit Zweden');


            koffieRepository.save(new Koffie(100L,"Espresso", "PureVorm","Italië", "1900", "Koffie", "onder druk"));
            koffieRepository.save(new Koffie(101L,"Caffè macchiato", "MelkEnRoomVorm","VS", "1995", "Beetje melkschuim", "Gevlekte koffie"));
            koffieRepository.save(new Koffie(102L,"Barraquito", "AlcoholischeVorm","Spanje", "1900", "laag gecondenseerde melk", ""));