package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ZsetTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void addZset(){
        ZSetOperations<String, Object> zset= redisTemplate.opsForZSet();
        zset.add("zsetTest","liuquan",1.1);
        zset.add("zsetTest","liuquan2",5.1);
        zset.add("zsetTest","liuquan3",7.1);
        zset.add("zsetTest","liuquan4",4.1);
        zset.add("zsetTest","liuquan",1.5);
    }


    /**
     *按分数排序（从小到大）按顺序返回元素个数的set集合
     */
    @Test
    public void Rank(){
        ZSetOperations<String, Object> opsForZSet= redisTemplate.opsForZSet();
        Set set =opsForZSet.range("zsetTest", 0, 2);
        System.out.println(set);
    }


    /**
     * 按分数排序（从小到大）按顺序返回元素个数的 Set<ZSetOperations.TypedTuple<Object>> 集合
     */
    @Test
    public void rangeWithScores(){
        ZSetOperations<String, Object> opsForZSet= redisTemplate.opsForZSet();
        Set<ZSetOperations.TypedTuple<Object>> set =opsForZSet.rangeWithScores("zsetTest", 1, 2);
        Iterator<ZSetOperations.TypedTuple<Object>>  iterator=set.iterator();

       while (iterator.hasNext()){
           ZSetOperations.TypedTuple<Object> next = iterator.next();
           System.out.println("Score: "+next.getScore()+" Value:"+next.getValue());
       }
    }

    /**
     *返回分数内的数据set【开始分数，终止分数】
     */
    @Test
    public void rangeByScore() {
        ZSetOperations<String, Object> opsForZSet = redisTemplate.opsForZSet();
        Set  set = opsForZSet.rangeByScore("zsetTest", 1.1, 4.1);
        System.out.println(set);
    }

    /**
     * 先按照分数从小大进行排序然后取范围内，和分数的输数据
     *
     */
    @Test
    public void rangeByScoreWithScores(){

        ZSetOperations<String, Object>  zet=   redisTemplate.opsForZSet();
        zet.rangeByScoreWithScores("zsetTest", 1.1, 4.1);

    }



}
