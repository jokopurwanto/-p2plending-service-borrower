package com.p2plending.borrower.controller;

import com.p2plending.borrower.dto.BorrowerCreateDto;
import com.p2plending.borrower.service.imple.BorrowerService;
import com.p2plending.borrower.handler.RespHandler;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class BorrowerController {

    @Autowired
    BorrowerService borrowerService;

    @PostMapping("/borrower")
    public ResponseEntity<Object> createCatalogDetails(@RequestBody @Valid BorrowerCreateDto borrowerCreateDto){
        return RespHandler.responseBuilder("sukses, data telah berhasil di-simpan",HttpStatus.OK, borrowerService.createBorrower(borrowerCreateDto));
    }

    @GetMapping("/borrower/{id}")
    public ResponseEntity<Object> getBorrowerDetails(@PathVariable Integer id){
        return RespHandler.responseBuilder("sukses, berikut detail data borrower",HttpStatus.OK, borrowerService.getBorrower(id));
    }

    @GetMapping("/borrower")
    public ResponseEntity<Object> listBorrowerDetails(){
        return RespHandler.responseBuilder("sukses, berikut list semua data borrower",HttpStatus.OK, borrowerService.getAllCBorrower());
    }

    @PutMapping("/borrower/{id}")
    public ResponseEntity<Object> updateBorrowerDetails(@RequestBody @Valid BorrowerCreateDto borrowerCreateDto, @PathVariable Integer id){
        return RespHandler.responseBuilder("sukses, berikut detail data borrower yang telah di-update",HttpStatus.OK, borrowerService.updateBorrower(borrowerCreateDto,id));
    }

    @DeleteMapping("/borrower/{id}")
    public ResponseEntity<Object> deleteBorrowerDetails(@PathVariable Integer id) {
        return RespHandler.responseBuilder("sukses, data telah berhasil di-delete",HttpStatus.OK, borrowerService.deleteBorrower(id));
    }

}
