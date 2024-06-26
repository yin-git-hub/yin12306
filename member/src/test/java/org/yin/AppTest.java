package org.yin;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    public void testApp()
    {
        //参数1为终端ID
//参数2为数据中心ID
        Snowflake snowflake = IdUtil.getSnowflake(1, 1);
        long id = snowflake.nextId();

//简单使用
        long id2 = IdUtil.getSnowflakeNextId();

        for (int i = 0; i < 50; i++) {
            String id3 = IdUtil.getSnowflakeNextIdStr();
            System.out.println(id3);
        }

    }
}
