--
-- Base de datos: `db_space_station`
--

CREATE DATABASE IF NOT EXISTS `db_space_station` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE `db_space_station`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_fuel_type`
--

CREATE TABLE `tbl_fuel_type` (
                                 `id` bigint(20) NOT NULL,
                                 `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_manned_spaceships`
--

CREATE TABLE `tbl_manned_spaceships` (
                                         `id` bigint(20) NOT NULL,
                                         `country` varchar(255) DEFAULT NULL,
                                         `height` double NOT NULL,
                                         `launch_date` date DEFAULT NULL,
                                         `name` varchar(255) DEFAULT NULL,
                                         `speed` double NOT NULL,
                                         `weight` double NOT NULL,
                                         `passenger_capacity` int(11) DEFAULT NULL,
                                         `purpose_type` varchar(255) DEFAULT NULL,
                                         `fuel_type_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_shuttle_vehicles`
--

CREATE TABLE `tbl_shuttle_vehicles` (
                                        `id` bigint(20) NOT NULL,
                                        `country` varchar(255) DEFAULT NULL,
                                        `height` double NOT NULL,
                                        `launch_date` date DEFAULT NULL,
                                        `name` varchar(255) DEFAULT NULL,
                                        `speed` double NOT NULL,
                                        `weight` double NOT NULL,
                                        `capacity_load` double DEFAULT NULL,
                                        `power` double DEFAULT NULL,
                                        `push` double DEFAULT NULL,
                                        `fuel_type_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_unmanned_spaceship`
--

CREATE TABLE `tbl_unmanned_spaceship` (
                                          `id` bigint(20) NOT NULL,
                                          `country` varchar(255) DEFAULT NULL,
                                          `height` double NOT NULL,
                                          `launch_date` date DEFAULT NULL,
                                          `name` varchar(255) DEFAULT NULL,
                                          `speed` double NOT NULL,
                                          `weight` double NOT NULL,
                                          `destination` varchar(255) DEFAULT NULL,
                                          `push` double DEFAULT NULL,
                                          `quantity_motors` int(11) DEFAULT NULL,
                                          `fuel_type_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_fuel_type`
--
ALTER TABLE `tbl_fuel_type`
    ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tbl_manned_spaceships`
--
ALTER TABLE `tbl_manned_spaceships`
    ADD PRIMARY KEY (`id`),
    ADD KEY `FKoyi4i05wpr4ltq1pn7l453a93` (`fuel_type_id`);

--
-- Indices de la tabla `tbl_shuttle_vehicles`
--
ALTER TABLE `tbl_shuttle_vehicles`
    ADD PRIMARY KEY (`id`),
    ADD KEY `FKmtfu1cngeplxhbtdy0by96xk1` (`fuel_type_id`);

--
-- Indices de la tabla `tbl_unmanned_spaceship`
--
ALTER TABLE `tbl_unmanned_spaceship`
    ADD PRIMARY KEY (`id`),
    ADD KEY `FKi80jytqpspa00c8gwhwnh3q8t` (`fuel_type_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tbl_fuel_type`
--
ALTER TABLE `tbl_fuel_type`
    MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbl_manned_spaceships`
--
ALTER TABLE `tbl_manned_spaceships`
    MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbl_shuttle_vehicles`
--
ALTER TABLE `tbl_shuttle_vehicles`
    MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbl_unmanned_spaceship`
--
ALTER TABLE `tbl_unmanned_spaceship`
    MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tbl_manned_spaceships`
--
ALTER TABLE `tbl_manned_spaceships`
    ADD CONSTRAINT `FKoyi4i05wpr4ltq1pn7l453a93` FOREIGN KEY (`fuel_type_id`) REFERENCES `tbl_fuel_type` (`id`);

--
-- Filtros para la tabla `tbl_shuttle_vehicles`
--
ALTER TABLE `tbl_shuttle_vehicles`
    ADD CONSTRAINT `FKmtfu1cngeplxhbtdy0by96xk1` FOREIGN KEY (`fuel_type_id`) REFERENCES `tbl_fuel_type` (`id`);

--
-- Filtros para la tabla `tbl_unmanned_spaceship`
--
ALTER TABLE `tbl_unmanned_spaceship`
    ADD CONSTRAINT `FKi80jytqpspa00c8gwhwnh3q8t` FOREIGN KEY (`fuel_type_id`) REFERENCES `tbl_fuel_type` (`id`);
COMMIT;