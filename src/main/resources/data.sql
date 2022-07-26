INSERT INTO `tbl_fuel_type` (`id`, `name`) VALUES
                                               (1, 'H(liq)'),
                                               (2, 'Sólido'),
                                               (3, 'Queroseno'),
                                               (4, 'NO4'),
                                               (5, 'N2H4'),
                                               (6, 'N(comp)'),
                                               (7, 'PuO2'),
                                               (8, 'Aerozina');

INSERT INTO `tbl_manned_spaceships` (`id`, `country`, `height`, `launch_date`, `name`, `speed`, `weight`, `passenger_capacity`, `purpose_type`, `fuel_type_id`) VALUES
                                                                                                                                                                    (1, 'Estados Unidos', 122, '2012-07-18', 'Apolo 11', 435, 77, 4, 'LUNAR_MISSION', 1),
                                                                                                                                                                    (2, 'Unión Soviética', 158, '2019-07-19', 'Vostok', 386, 420, 7, 'HUMAN_BEHAVIOR', 5),
                                                                                                                                                                    (3, 'China', 136, '2022-07-04', 'Gemini', 248, 19.5, 3, 'SATELLITES_MAINTENANCE', 8);

INSERT INTO `tbl_shuttle_vehicles` (`id`, `country`, `height`, `launch_date`, `name`, `speed`, `weight`, `capacity_load`, `power`, `push`, `fuel_type_id`) VALUES
                                                                                                                                                               (1, 'EE.UU.', 100, '2012-06-13', 'Saturno V', 32000, 2900, 118, 32000, 3500, 3),
                                                                                                                                                               (2, 'Unión Soviética', 60, '2014-07-18', 'Lanzador Energía', 12000, 2400, 100, 3000, 3060, 6),
                                                                                                                                                               (3, 'Rusia', 150, '2018-07-11', 'Astrobee 200', 20000, 3500, 150, 12000, 4500, 4);

INSERT INTO `tbl_unmanned_spaceship` (`id`, `country`, `height`, `launch_date`, `name`, `speed`, `weight`, `destination`, `push`, `quantity_motors`, `fuel_type_id`) VALUES
                                                                                                                                                                         (1, 'EE.UU. - Italia', 100, '1995-07-11', 'Cassini-Huygens', 18000, 1093, 'Saturno y sus lunas', 45.39, 4, 7),
                                                                                                                                                                         (2, 'EE.UU.', 120, '1975-07-29', 'Pionero X', 56000, 258, 'Júpiter', 26, 16, 1);