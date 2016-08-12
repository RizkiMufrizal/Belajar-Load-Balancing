package com.rizki.mufrizal.belajar.load.balancing.repository;

import com.rizki.mufrizal.belajar.load.balancing.domain.Barang;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com> <https://RizkiMufrizal.github.io>
 * @Since 10 August 2016
 * @Time 21:29
 * @Project Spring-Boot-Load-Balancing
 * @Package com.rizki.mufrizal.belajar.load.balancing.repository
 * @File BarangRepository
 */
public interface BarangRepository extends PagingAndSortingRepository<Barang, String> {
}
