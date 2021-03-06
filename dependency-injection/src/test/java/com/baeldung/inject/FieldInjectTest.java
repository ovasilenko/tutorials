package com.baeldung.inject;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.baeldung.configuration.ApplicationContextTestInjectType;
import com.baeldung.dependency.ArbitraryDependency;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
    loader=AnnotationConfigContextLoader.class,
    classes=ApplicationContextTestInjectType.class)
public class FieldInjectTest {

    @Inject
    private ArbitraryDependency fieldInjectDependency;

    @Test
    public void givenInjectAnnotation_WhenOnField_ThenValidDependency(){
        assertNotNull(fieldInjectDependency);
        assertEquals("Arbitrary Dependency",
                        fieldInjectDependency.toString());
    }
}
