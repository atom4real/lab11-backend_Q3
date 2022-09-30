package se331.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;
import se331.rest.entity.AuctionItem;
import se331.rest.service.AuctionService;
import se331.rest.util.LabMapper;

import java.util.List;

public class AuctionController {
    @Autowired
    AuctionService auctionService;

    @GetMapping("auction")
    public ResponseEntity<?> getEventLists(@RequestParam(value = "_limit", required = false) Integer perPage
            , @RequestParam(value = "_page", required = false) Integer page) {
        Page<AuctionItem> pageOutput = auctionService.getAuctions(perPage,page);
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.set("x-total-count",String.valueOf(pageOutput.getTotalElements()));
        return new
                ResponseEntity<>(LabMapper.INSTANCE.getAuctionDto(pageOutput.getContent()),responseHeader,HttpStatus.OK);
    }

    @GetMapping("auction/{id}")
    public ResponseEntity<?> getEvent(@PathVariable("id") Long id) {
        AuctionItem output = auctionService.getAuction(id);
        if (output != null) {
            return ResponseEntity.ok(LabMapper.INSTANCE.getAuctionDto(output));
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The given id is not found");
        }
    }
}
