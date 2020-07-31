package com.film.service.impl;
import com.film.mapper.ActorMapper;
import com.film.pojo.Actor;
import com.film.service.IActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ActorService implements IActorService {
    @Autowired
    ActorMapper actorMapper;
    @Override
    public int add(Actor actor) {
        return actorMapper.insert(actor);
    }

    @Override
    public Actor get(int id) {
        return actorMapper.selectByPrimaryKey((long) id);
    }

    @Override
    public int delete(int id) {
        return actorMapper.deleteByPrimaryKey((long) id);
    }

    @Override
    public int update(Actor actor) {
        return actorMapper.updateByPrimaryKey(actor);
    }

    @Override
    public List<Actor> list() {
        return actorMapper.selectAll();
    }
    @Override
    public List<Actor> listm() {
        return actorMapper.selectMAll();
    }
}
