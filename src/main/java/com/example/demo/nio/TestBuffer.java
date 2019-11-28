package com.example.demo.nio;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * -.缓冲区(Buffer): 在Java NIO 中负责数据的存取。缓冲区就是数组。用于存储不同数据类型的数据
 * 根据数据类型不行(boolean 除外），提供了相应类型的缓冲区
 * ByteBuffer
 * CharBuffer
 * ShortBuffer
 * IntBuffer
 * LongBuffer
 * FloatBuffer
 * DoubleBuffer
 * <p>
 * <p>
 * 上述缓冲区的管理方式基本一致。都是通过allocate 获取缓冲区
 * <p>
 * 二、缓冲区存取数据的两个核心方法：
 * put():存入数据到缓冲区中
 * get():获取缓冲区中的数据
 * <p>
 * 四、缓冲区中的四个核心属性：
 * <p>
 * capacity:容量，表示缓冲区中的最大存储数据的容量。一旦声明不能改变
 * limit：界限，表示缓冲区中可以操作数据的大小。（limit 后数据不能进行读写）
 * position：位置，表示换种区中正在操作的数据的位置
 * <p>
 * mark:标记，表示记录当前position位置，可以通过reset()回复到mark的位置
 * <p>
 * 0 <= mark <= position <= limit <= capacity
 * <p>
 * 四、直接缓冲区与非直接缓冲区：
 * 非直接缓冲区：通过 allocate() 方法分配缓冲区，将缓冲区建立在 JVM 的内存中
 * 直接缓冲区：通过 allocateDirect() 方法分配直接缓冲区，将缓冲区建立在物理内存中。可以提高效率
 */
public class TestBuffer {
    @Test
    public void IsDirect() {
        //分配直接缓冲区
        ByteBuffer buf = ByteBuffer.allocateDirect(1024);

        System.out.println(buf.isDirect());
    }

    @Test
    public void testAPI() {
        String str = "study";

        ByteBuffer buf = ByteBuffer.allocate(1024);

        buf.put(str.getBytes());

        buf.flip();

        byte[] dst = new byte[buf.limit()];
        buf.get(dst, 0, 2);
        System.out.println(new String(dst, 0, 2));
        System.out.println(buf.position());

        //mark() : 标记
        buf.mark();

        buf.get(dst, 2, 2);
        System.out.println(new String(dst, 2, 2));
        System.out.println(buf.position());

        //reset() : 恢复到 mark 的位置
        buf.reset();
        System.out.println(buf.position());

        //判断缓冲区中是否还有剩余数据
        if (buf.hasRemaining()) {

            //获取缓冲区中可以操作的数量
            System.out.println(buf.remaining());
        }
    }

    @Test
    public void testByteBuffer() {
        String bufferData = "good";
        //1.分配一个指定缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        print(buffer);
        //2.利用普通存入缓冲区
        buffer.put(bufferData.getBytes());
        print(buffer);

        //3.切换到读取数据模式
        buffer.flip();
        print(buffer);
        //4.利用get()读取缓冲区的数据

        byte[] dest = new byte[buffer.limit()];
        buffer.get(dest);
        System.out.println("data = " + new String(dest, 0, dest.length));
        print(buffer);

        //5.rewind(); 可重复读
        buffer.rewind();

        //6.clear():清空缓冲区。但是缓冲区的数据依然存在，但是处于“被遗忘状态”（limit,position被还原成原来，不能通过这些找到原来数据）

        print(buffer);
    }

    private void print(ByteBuffer buffer) {
        System.out.println("position = " + buffer.position());
        System.out.println("limit = " + buffer.limit());
        System.out.println("capacity = " + buffer.capacity());
        System.out.println("************");
    }

}
