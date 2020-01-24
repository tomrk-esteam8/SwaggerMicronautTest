package io.swagger.api;

import io.swagger.model.Sample;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.micronaut.http.*;
import io.micronaut.http.annotation.*;
import io.reactivex.Single;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.responses.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface SampleApi {


    @Operation(summary = "Add a new sample to the database", operationId = "addSample", description = "", tags={ "sample", })
    @ApiResponse(responseCode = "405", description = "Invalid input")
    @Post(value = "/sample",
        consumes = { "application/json", "application/xml" }
        )
    default Single<HttpResponse<Void>> addSample(
          @Parameter(description = "Sample that needs to be added to the database", required = true ) @Valid @Body Sample body  
  ) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Deletes a sample", operationId = "deleteSample", description = "", tags={ "sample", })
    @ApiResponse(responseCode = "400", description = "Invalid ID supplied")
    @ApiResponse(responseCode = "404", description = "Sample not found")
    @Delete(value = "/sample/{sampleId}"
        )
    default Single<HttpResponse<Void>> deleteSample(
        @Parameter(description = "Sample id to delete", required = true) @PathVariable("sampleId") Long sampleId      
  ) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Finds sample by status", operationId = "findSamplesByStatus", description = "Multiple status values can be provided with comma separated strings", tags={ "sample", })
    @ApiResponse(responseCode = "200", description = "successful operation")
    @ApiResponse(responseCode = "400", description = "Invalid status value")
    @Get(value = "/sample/findByStatus",
        produces = { "application/xml", "application/json" }
        )
    default Single<HttpResponse<List<Sample>>> findSamplesByStatus(
      @NotNull @Parameter(description = "Status values that need to be considered for filter", required = true) @Valid @NotNull @QueryValue(value = "status") List<String> status
  ) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Find sample by ID", operationId = "getSampleById", description = "Returns a single sample", tags={ "sample", })
    @ApiResponse(responseCode = "200", description = "successful operation")
    @ApiResponse(responseCode = "400", description = "Invalid ID supplied")
    @ApiResponse(responseCode = "404", description = "Sample not found")
    @Get(value = "/sample/{sampleId}",
        produces = { "application/xml", "application/json" }
        )
    default Single<HttpResponse<Sample>> getSampleById(
        @Parameter(description = "ID of sample to return", required = true) @PathVariable("sampleId") Long sampleId      
  ) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Update an existing sample", operationId = "updateSample", description = "", tags={ "sample", })
    @ApiResponse(responseCode = "400", description = "Invalid ID supplied")
    @ApiResponse(responseCode = "404", description = "Sample not found")
    @ApiResponse(responseCode = "405", description = "Validation exception")
    @Put(value = "/sample",
        consumes = { "application/json", "application/xml" }
        )
    default Single<HttpResponse<Void>> updateSample(
          @Parameter(description = "Sample that needs to be updated in the database", required = true ) @Valid @Body Sample body  
  ) {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }

}
