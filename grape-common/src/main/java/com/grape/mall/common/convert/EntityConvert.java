package com.grape.mall.common.convert;

import java.util.List;

public interface EntityConvert<D, V, E> {

    /**
     * VO转Entity
     * @param vo
     * @return
     */
    E toEntity(V vo);

    /**
     * Entity转DTO
     * @param entity
     * @return
     */
    D toDto(E entity);

    /**
     * VO集合转Entity集合
     * @param voList
     * @return
     */
    List<E> toEntity(List<V> voList);

    /**
     * Entity集合转DTO集合
     * @param entityList
     * @return
     */
    List<D> toDto(List<E> entityList);
}
