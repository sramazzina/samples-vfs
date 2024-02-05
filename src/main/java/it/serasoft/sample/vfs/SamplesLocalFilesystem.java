package it.serasoft.sample.vfs;

import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileSystemManager;
import org.apache.commons.vfs2.VFS;
import org.apache.commons.vfs2.impl.DefaultFileSystemManager;

class SamplesLocalFilesystem {
  public static void main(String[] args) {
    try {
      DefaultFileSystemManager fsm = new DefaultFileSystemManager();
      fsm.addProvider(
          "file", new org.apache.commons.vfs2.provider.local.DefaultLocalFileProvider());
      fsm.init();

    } catch (FileSystemException e) {
      throw new RuntimeException(e);
    }
  }
}
