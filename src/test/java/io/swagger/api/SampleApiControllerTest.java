package io.swagger.api;

import io.swagger.model.Sample;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

@MicronautTest
class SampleApiControllerTest {

    @Inject
    private SampleApi api;

    @Test
    void addSampleTest() {
        Sample body = new Sample();
        try {
            api.addSample(body).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void deleteSampleTest() {
        Long sampleId = 789L;
        try {
            api.deleteSample(sampleId).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void findSamplesByStatusTest() {
        List<String> status = Arrays.asList("status_example");
        try {
            api.findSamplesByStatus(status).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void getSampleByIdTest() {
        Long sampleId = 789L;
        try {
            api.getSampleById(sampleId).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

    @Test
    void updateSampleTest() {
        Sample body = new Sample();
        try {
            api.updateSample(body).blockingGet();
        } catch (UnsupportedOperationException e) {
            assumeTrue(false, "API is not yet implemented");
        }
    }

}
