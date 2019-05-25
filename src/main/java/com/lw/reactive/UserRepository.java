package com.lw.reactive;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

/**
 * @description:
 * @author: luo.wen
 * @createTime: 2019/5/25
 */
public interface UserRepository extends ReactiveCrudRepository {
    Mono<User> findByUsername(String username);
    Mono<Long> deleteByUsername(String username);
}
