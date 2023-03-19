package gg.acai.acava.caches.element;

import gg.acai.acava.caches.CacheElement;

import java.lang.ref.WeakReference;

/**
 * @author Clouke
 * @since 19.03.2023 15:21
 * © Acava - All Rights Reserved
 */
public final class WeakCacheElement<V> implements CacheElement<V> {

  private WeakReference<V> reference;

  public WeakCacheElement(V value) {
    this.reference = new WeakReference<>(value);
  }

  @Override
  public V get() {
    return reference.get();
  }

  @Override
  public void clear() {
    reference.clear();
    reference = null;
  }
}
