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


//    @GetMapping("/catalog/{id}")
//    public ResponseEntity<CatalogModel> get(@PathVariable Integer id){
//        try {
//            CatalogModel catalogModel = catalogService.getCatalog(id);
//            return new ResponseEntity<CatalogModel>(catalogModel, HttpStatus.OK);
//        } catch (NoSuchElementException e){
//            return new ResponseEntity<CatalogModel>(HttpStatus.NOT_FOUND);
//        }
//    }

//    @PutMapping("/catalog/{id}")
//    public ResponseEntity<?> update(@RequestBody CatalogModel catalogModel, @PathVariable Integer id){
//        try {
//            CatalogModel existCatalog = catalogService.getCatalog(id);
//            catalogService.save(catalogModel);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (NoSuchElementException e){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }

//    @DeleteMapping("/catalog/{id}")
//    public void delete(@PathVariable Integer id) {
//        catalogService.deleteCatalog(id);
//    }

//    @PostMapping("/catalog")
//    public void add(@RequestBody CatalogModel catalogModel){
//        catalogService.save(catalogModel);
//    }

    @PostMapping("/borrower")
    public ResponseEntity<Object> createCatalogDetails(@RequestBody @Valid BorrowerCreateDto borrowerCreateDto){
        return RespHandler.responseBuilder("sukses, data telah berhasil di-simpan",HttpStatus.OK, borrowerService.createBorrower(borrowerCreateDto));
    }

//    @PostMapping("/catalog/cancel-booking")
//    public ResponseEntity<Object> createCatalogDetails(@RequestBody @Valid CatalogCancelOrder catalogCancelOrder) throws ParseException {
//        return RespHandler.responseBuilder("sukses, cancel booking telah berhasil di-simpan",HttpStatus.OK, borrowerService.cancelBooking(catalogCancelOrder));
//    }
//
//    @PostMapping("/catalog/booking")
//    public ResponseEntity<?> updateCatalogDetails(@RequestBody @Valid CatalogDto catalogDto) throws ParseException {
//        return RespHandler.responseBuilder("sukses, data catalog telah berhasil di-update",HttpStatus.OK, borrowerService.updateCatalog(catalogDto));
//    }
//
//    @GetMapping("/catalog/{id}")
//    public ResponseEntity<Object> getCatalogDetails(@PathVariable Integer id){
//        return RespHandler.responseBuilder("sukses, berikut detail data catalog",HttpStatus.OK, borrowerService.getCatalog(id));
//    }
//
    @GetMapping("/borrower")
    public ResponseEntity<Object> listBorrowerDetails(){
        return RespHandler.responseBuilder("sukses, berikut list semua data borrower",HttpStatus.OK, borrowerService.getAllCBorrower());
    }
//
//    @DeleteMapping("/catalog/{id}")
//    public ResponseEntity<Object> deleteCatalogDetails(@PathVariable Integer id) {
//        return RespHandler.responseBuilder("sukses, data telah berhasil di-delete",HttpStatus.OK, borrowerService.deleteCatalog(id));
//    }

}
