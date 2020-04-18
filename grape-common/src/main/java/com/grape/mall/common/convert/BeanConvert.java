package com.grape.mall.common.convert;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;

public interface BeanConvert<D, V, E> {

    /**
     * VO转Model
     * @param vo
     * @return
     */
    E toModel(V vo);

    /**
     * Model转DTO
     * @param entity
     * @return
     */
    D toDto(E entity);

    /**
     * VO集合转Model集合
     * @param voList
     * @return
     */
    List<E> toModel(List<V> voList);

    /**
     * Model集合转DTO集合
     * @param entityList
     * @return
     */
    List<D> toDto(List<E> entityList);

    /**
     * Model分页集合转DTO分页集合
     * @param entityList
     * @return
     */
    Page<D> toPageDto(Page<E> entityList);
}
