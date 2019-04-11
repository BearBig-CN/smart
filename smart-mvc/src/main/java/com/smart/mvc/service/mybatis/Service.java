package com.smart.mvc.service.mybatis;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.smart.mvc.model.Pagination;
import com.smart.mvc.model.PersistentObject;

/**
 * Service接口
 *
 * @param <T>
 * @param <ID>
 * @author Joe
 */
public interface Service<T extends PersistentObject, ID extends Serializable> {

    /**
     * 查询所有分页
     *
     * @param p
     * @return
     */
    Pagination<T> findByAllPagination(Pagination<T> p);

    /**
     * 通过主键查询实体
     *
     * @param pk
     * @return T
     */
    T get(ID pk);

    /**
     * 通过主键集合查询实体
     *
     * @param pks
     * @return List<T>
     */
    List<T> get(Collection<ID> pks);

    /**
     * 插入/更新实体
     *
     * @param t
     */
    void save(T t);

    /**
     * 插入/更新实体集合
     *
     * @param ts
     */
    void save(Collection<T> ts);

    /**
     * 更新实体
     *
     * @param t
     */
    void update(T t);

    /**
     * 更新实体集合
     *
     * @param ts
     */
    void update(Collection<T> ts);

    /**
     * 删除实体
     *
     * @param t
     */
    void delete(T t);

    /**
     * 删除实体集合
     *
     * @param ts
     */
    void delete(Collection<T> ts);

    /**
     * 通过主键删除实体
     *
     * @param id
     * @return T
     */
    void deleteById(ID id);

    /**
     * 通过主键集合删除实体 注：这里别把List改为Collection，会导致覆盖方法的List<ID>调用不到
     *
     * @param idList
     * @return List<T>
     */
    void deleteById(List<ID> idList);
}
