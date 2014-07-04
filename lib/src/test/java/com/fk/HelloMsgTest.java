package com.fk;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HelloMsgTest {
    @Test
    public void shouldHaveTheCorrectMessage_forDefaultUser() {
        assertThat(new HelloMsg().getMsg(), is("Hello Mr. Anonymous!"));
    }

    @Test
    public void shouldHaveTheCorrectMessage_forKnownUser() {
        assertThat(new HelloMsg("user1").getMsg(), is("Hello Jack!"));
    }
}
