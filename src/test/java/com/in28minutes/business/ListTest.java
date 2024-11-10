package com.in28minutes.business;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.*;

public class ListTest {

    @Test
    public void test() {
        // Given
        List<String> listMock = mock(List.class);

        // When
        given(listMock.size()).willReturn(2);

        // Then
        assertThat(listMock.size(), is(2));
    }
}
