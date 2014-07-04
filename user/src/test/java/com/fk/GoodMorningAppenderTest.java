package com.fk;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GoodMorningAppenderTest {
    @Test
    public void shouldSay_GoodMorning() {
        GoodMorningAppender appender = new GoodMorningAppender(new HelloMsg("user1"));
        assertThat(appender.goodMorningMsg(), is("Hello Jack! Good morning!"));
    }
}
