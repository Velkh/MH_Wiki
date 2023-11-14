-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 14 Nov 2023 pada 04.48
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mh_wiki`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `Admin_ID` int(5) NOT NULL,
  `Admin_Name` varchar(50) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`Admin_ID`, `Admin_Name`, `Username`, `Password`) VALUES
(2, 'Bagus Adhi Nugroho', 'sugab123', 'sugab123'),
(9, 'Ishom Nabil Umran Alihaq', 'mori123', 'mori123'),
(57, 'Ilham Kukri', 'ilham123', 'ilham123'),
(61, 'Ilham Kukri', 'ilham123', 'ilham123'),
(62, 'Ilham Kukri', 'ilham123', 'ilham123'),
(64, 'Ilham Kukri', 'ilham123', 'ilham123'),
(65, 'Ilham Kukri', 'ilham123', 'ilham123'),
(66, 'Ilham Kukri', 'ilham123', 'ilham123'),
(67, 'Ilham Kukri', 'ilham123', 'ilham123'),
(68, 'Ilham Kukri', 'ilham123', 'ilham123'),
(69, 'Ilham Kukri', 'ilham123', 'ilham123'),
(70, 'Ilham Kukri', 'ilham123', 'ilham123'),
(71, 'Ilham Kukri', 'ilham123', 'ilham123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `biome`
--

CREATE TABLE `biome` (
  `Biome_ID` int(5) NOT NULL,
  `Biome_Name` varchar(50) NOT NULL,
  `Biome_Desc` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `biome`
--

INSERT INTO `biome` (`Biome_ID`, `Biome_Name`, `Biome_Desc`) VALUES
(1, 'Ancient Forest 2.0', 'Its just a massive forest'),
(2, 'Castle Schrade', 'A castle to an ancient civilisation long ago was laid to ruin by the Fatalis. The sky now tainted red and the area devoid of any life. It is now the home to the black dragon. Weapons such as balistas and a dragonator remain from the great battle. '),
(3, 'Guiding Lands', 'Gatau Bang Pusing'),
(5, 'Secluded Valley', 'A place that Alatreon live'),
(6, 'Hoarfrost Reach', 'Hoarfrost Reach is a Location in Monster Hunter World (MHW) and is part of the Iceborne Expansion of September 6th 2019. This frosted land is home to dangerous monsters and recommended for Master Rank players. Different areas of the game have a different look and feel, map and special unique monsters that spawn within them.'),
(7, 'Wildspire Waste', 'Wildspire Waste is a large desert featuring dunes and unexpected swamps, with poor vegetation and rare monsters that can withstand the harsh conditions of life in the Wastes. A massive strip of parched land conjoined with a swampland that takes in water from the Ancient Forest. Ant colonies have built massive spires within the desert, while varied vegetation has sprung up along many watering holes. This locale is now home to creatures that take advantage of the two unique, coexisting ecosystems.”'),
(8, 'Rotten Vale', 'Rotten Vale is a poisonous and hazardous area of The New World. Bones and corpses pile up, generating toxic fumes that are extremely harmful to Hunters and render even docile Monsters aggressive, and an entire ecosystem revolving around decomposition. Venture into the depths of the Rotten Vale in your journey to unravel the mysteries of the Elder Crossing.'),
(9, 'Coral Highland', 'Coral Highlands is a brand new location that has been shown in early gameplay videos. A mysterious ecological highland that mimics the ebb and flow of the ocean itself. Eggs from the corals ride upon the rising currents and spread to the rest of the New World, where they become a part of the natural food chain. The area is a colorful and vibrant dry coral reef site, with high peaks and cannyons as well as mysterious caves.'),
(10, 'Elder\'s Recess', 'The Elder\'s Recess is a zone unlocked after diverting Zorah Magdaros away from the Everstream and then hunting down the Pink Rathian. Items such as the Firecell core can be found in mining nodes throughout the area.'),
(30, 'MR: Arena', 'A place you fight the monster you have captured'),
(31, 'Astrea', 'Gass'),
(32, 'Seliana Supply Cache', 'Place for saving stock'),
(62, 'Seliana Supply Cache', 'Place for saving stock'),
(63, 'Seliana Supply Cache', 'Place for saving stock'),
(64, 'Seliana Supply Cache', 'Place for saving stock'),
(65, 'Seliana Supply Cache', 'Place for saving stock'),
(66, 'Seliana Supply Cache', 'Place for saving stock'),
(67, 'Seliana Supply Cache', 'Place for saving stock'),
(68, 'Seliana Supply Cache', 'Place for saving stock');

-- --------------------------------------------------------

--
-- Struktur dari tabel `carveitem`
--

CREATE TABLE `carveitem` (
  `CI_ID` int(5) NOT NULL,
  `LM_ID` int(5) NOT NULL,
  `Item_Name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `carveitem`
--

INSERT INTO `carveitem` (`CI_ID`, `LM_ID`, `Item_Name`) VALUES
(1, 1, 'Rathalos Shard'),
(2, 1, 'Rathalos Cortex'),
(3, 1, 'Rathalos Fellwing'),
(4, 1, 'Rathalos Medulla'),
(5, 2, 'Rathian Cortex'),
(6, 2, 'Rathian Shard'),
(7, 2, 'Rathian Weave'),
(8, 2, 'Rathian Surspike'),
(9, 2, 'Rathian Ruby'),
(10, 2, 'Rathian Mantle'),
(11, 3, 'Nargacuga Shard'),
(12, 3, 'Nargacuga Blackfur+'),
(13, 3, 'Nargacuga Hardfang'),
(14, 3, 'Nargacuga Tailspear'),
(15, 3, 'Nargacuga Lash'),
(16, 3, 'Nargacuga Mantle'),
(17, 4, 'Tigrex Cortex'),
(18, 4, 'Tigrex Shard'),
(19, 4, 'Tigrex Hardclaw'),
(20, 4, 'Tigrex Hardfang'),
(21, 4, 'Tigrex Mantle'),
(22, 5, 'Rajang Hardfang'),
(23, 5, 'Rajang Wildpelt'),
(24, 5, 'Rajang Hardclaw'),
(25, 5, 'Rajang Pelt+'),
(26, 10, 'Velkhana Shard'),
(27, 10, 'Velkhana Cortex'),
(28, 10, 'Velkhana Hardclaw'),
(29, 10, 'Velkhana Crownhorn'),
(30, 10, 'Velkhana Fellwing'),
(31, 10, 'Velkhana Crystal'),
(33, 7, 'Brach Obliterator'),
(34, 7, 'Brach Warhead'),
(35, 7, 'Flashpoint Slime'),
(36, 6, 'Deviljho Blackpiel'),
(37, 6, 'Deviljho Shard'),
(38, 6, 'Deviljho Ripper'),
(39, 6, 'Vile Fang'),
(40, 6, 'Black Blood'),
(41, 6, 'Deviljho Crook'),
(42, 8, 'Alatreon mantle'),
(43, 8, 'Alatreon Pallium '),
(44, 8, 'Alatreon Riptalon'),
(45, 8, 'Alatreon Diretail'),
(46, 8, 'Alatreon Direwing '),
(47, 8, 'Alatreon Skywayer'),
(48, 9, 'Fatalis Shard'),
(49, 9, 'Fatalis Cortex'),
(50, 9, 'Fatalis Pectus'),
(51, 9, 'Fatalis Hardhorn'),
(52, 9, 'Fatalis Fellwing'),
(53, 9, 'Fatalis Evil Eye');

-- --------------------------------------------------------

--
-- Struktur dari tabel `largemonster`
--

CREATE TABLE `largemonster` (
  `LM_ID` int(5) NOT NULL,
  `LM_Name` varchar(50) NOT NULL,
  `LM_Type` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `largemonster`
--

INSERT INTO `largemonster` (`LM_ID`, `LM_Name`, `LM_Type`) VALUES
(1, 'Rathalos', 'Flying Wyvern'),
(2, 'Gold Rathian', 'Flying Wyvern'),
(3, 'Nargacuga', 'Flying Wyvern'),
(4, 'Tigrex', 'Flying Wyvern'),
(5, 'Rajang', 'Fanged Beast'),
(6, 'Savage Deviljho', 'Brute Wyvern'),
(7, 'Raging Brachydios', 'Brute Wyvern'),
(8, 'Alatreon', 'Elder Dragon'),
(9, 'Fatalis', 'Elder Dragon'),
(10, 'Velkhana', 'Elder Dragon'),
(12, 'Gore Magala', 'Unknown'),
(14, 'Ilham Kukri', 'Elder Dragon'),
(32, 'Ilham Kukri', 'Elder Dragon'),
(33, 'Ilham Kukri', 'Elder Dragon'),
(34, 'Ilham Kukri', 'Elder Dragon'),
(35, 'Ilham Kukri', 'Elder Dragon'),
(36, 'Ilham Kukri', 'Elder Dragon'),
(37, 'Ilham Kukri', 'Elder Dragon'),
(38, 'Ilham Kukri', 'Elder Dragon');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mainquest`
--

CREATE TABLE `mainquest` (
  `MQ_ID` int(5) NOT NULL,
  `MQ_Name` varchar(50) NOT NULL,
  `LM_ID` int(5) NOT NULL,
  `Biome_ID` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `mainquest`
--

INSERT INTO `mainquest` (`MQ_ID`, `MQ_Name`, `LM_ID`, `Biome_ID`) VALUES
(1001, 'Fade To Black', 9, 2),
(1007, 'Swoop to a New Low', 1, 1),
(1008, 'The Black Wind', 3, 9),
(1009, 'Ever-present Shadow', 3, 1),
(1010, 'Absolute Power', 4, 8),
(1011, 'The Purr-fect Room : Stone', 4, 6),
(1012, 'A Tale of Ice and Fire', 10, 10),
(1013, 'The Iceborne Wyvern', 10, 6),
(1014, 'Dawn of the Death Star', 8, 5),
(1015, '...And My Rage for All', 7, 3),
(1016, 'Achy Brachy Heart', 7, 3),
(1017, 'A Reason Behind the Hunger', 6, 10),
(1018, 'Guiding Land : Expedition', 6, 3),
(1019, 'Reveal Thyself, Destroyer', 5, 3);

-- --------------------------------------------------------

--
-- Struktur dari tabel `smallmonster`
--

CREATE TABLE `smallmonster` (
  `SM_ID` int(5) NOT NULL,
  `SM_Name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `smallmonster`
--

INSERT INTO `smallmonster` (`SM_ID`, `SM_Name`) VALUES
(1, 'El Gato'),
(2, 'Hornetaur'),
(4, 'Wulg'),
(6, 'Gajalaka'),
(8, 'Jagras'),
(11, 'kestodon'),
(12, 'Barnos'),
(13, 'Gastodon'),
(14, 'Gajau'),
(15, 'Boaboa'),
(19, 'Wilson'),
(20, 'Wilson'),
(27, 'Wilson'),
(28, 'Wilson'),
(29, 'Wilson'),
(30, 'Wilson'),
(31, 'Wilson'),
(32, 'Wilson'),
(33, 'Wilson');

-- --------------------------------------------------------

--
-- Struktur dari tabel `subquest`
--

CREATE TABLE `subquest` (
  `Sub_ID` int(5) NOT NULL,
  `SM_ID` int(5) NOT NULL,
  `Biome_ID` int(5) NOT NULL,
  `Sub_Name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `subquest`
--

INSERT INTO `subquest` (`Sub_ID`, `SM_ID`, `Biome_ID`, `Sub_Name`) VALUES
(1, 4, 6, 'Call of The Wild'),
(2, 8, 1, 'Jagras of the Ancient Forest'),
(3, 1, 7, 'Exterminator of the Waster'),
(4, 6, 10, 'Chef Quest! Gajalka Lockdown'),
(5, 2, 8, 'Persistent Pest'),
(6, 13, 10, 'A Meow for Help'),
(7, 12, 10, 'A Scalding Scoop'),
(8, 14, 7, 'The Pain from Gain'),
(9, 8, 1, 'A Kestodon Kerfuffle'),
(10, 15, 6, 'Boaboa Constrictor');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Admin_ID`);

--
-- Indeks untuk tabel `biome`
--
ALTER TABLE `biome`
  ADD PRIMARY KEY (`Biome_ID`);

--
-- Indeks untuk tabel `carveitem`
--
ALTER TABLE `carveitem`
  ADD PRIMARY KEY (`CI_ID`),
  ADD KEY `LM_ID` (`LM_ID`);

--
-- Indeks untuk tabel `largemonster`
--
ALTER TABLE `largemonster`
  ADD PRIMARY KEY (`LM_ID`);

--
-- Indeks untuk tabel `mainquest`
--
ALTER TABLE `mainquest`
  ADD PRIMARY KEY (`MQ_ID`),
  ADD KEY `LM_ID` (`LM_ID`),
  ADD KEY `Biome_ID` (`Biome_ID`);

--
-- Indeks untuk tabel `smallmonster`
--
ALTER TABLE `smallmonster`
  ADD PRIMARY KEY (`SM_ID`);

--
-- Indeks untuk tabel `subquest`
--
ALTER TABLE `subquest`
  ADD PRIMARY KEY (`Sub_ID`),
  ADD KEY `SM_ID` (`SM_ID`),
  ADD KEY `Biome_ID` (`Biome_ID`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `admin`
--
ALTER TABLE `admin`
  MODIFY `Admin_ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=72;

--
-- AUTO_INCREMENT untuk tabel `biome`
--
ALTER TABLE `biome`
  MODIFY `Biome_ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=69;

--
-- AUTO_INCREMENT untuk tabel `carveitem`
--
ALTER TABLE `carveitem`
  MODIFY `CI_ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

--
-- AUTO_INCREMENT untuk tabel `largemonster`
--
ALTER TABLE `largemonster`
  MODIFY `LM_ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT untuk tabel `mainquest`
--
ALTER TABLE `mainquest`
  MODIFY `MQ_ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1020;

--
-- AUTO_INCREMENT untuk tabel `smallmonster`
--
ALTER TABLE `smallmonster`
  MODIFY `SM_ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT untuk tabel `subquest`
--
ALTER TABLE `subquest`
  MODIFY `Sub_ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `carveitem`
--
ALTER TABLE `carveitem`
  ADD CONSTRAINT `carveitem_ibfk_1` FOREIGN KEY (`LM_ID`) REFERENCES `largemonster` (`LM_ID`);

--
-- Ketidakleluasaan untuk tabel `mainquest`
--
ALTER TABLE `mainquest`
  ADD CONSTRAINT `mainquest_ibfk_1` FOREIGN KEY (`LM_ID`) REFERENCES `largemonster` (`LM_ID`),
  ADD CONSTRAINT `mainquest_ibfk_2` FOREIGN KEY (`Biome_ID`) REFERENCES `biome` (`Biome_ID`);

--
-- Ketidakleluasaan untuk tabel `subquest`
--
ALTER TABLE `subquest`
  ADD CONSTRAINT `subquest_ibfk_1` FOREIGN KEY (`SM_ID`) REFERENCES `smallmonster` (`SM_ID`),
  ADD CONSTRAINT `subquest_ibfk_2` FOREIGN KEY (`Biome_ID`) REFERENCES `biome` (`Biome_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
