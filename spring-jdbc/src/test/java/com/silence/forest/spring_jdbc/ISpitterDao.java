package com.silence.forest.spring_jdbc;

import java.util.List;

/**
 * 
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月7日下午3:44:50 TODO</li>
 * </ul> 
 */
public interface ISpitterDao {
	void addSpitter(Spitter spitter);

    void saveSpitter(Spitter spitter);

    Spitter getSpitterById(long id);

    List<Spittle> getRecentSpittle();

    void saveSpittle(Spittle spittle);

    List<Spittle> getSpittlesForSpitter(Spitter spitter);

    Spitter getSpitterByUsername(String username);

    void deleteSpittle(long id);

    Spittle getSpittleById(long id);

    List<Spitter> findAllSpitters();
}
