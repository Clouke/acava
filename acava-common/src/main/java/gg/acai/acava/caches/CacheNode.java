package gg.acai.acava.caches;

/**
 * @author Clouke
 * @since 19.03.2023 15:20
 * © Acava - All Rights Reserved
 */
public interface CacheNode<V> {

  V get();

  void clear();

}