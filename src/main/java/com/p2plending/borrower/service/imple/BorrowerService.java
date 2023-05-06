package com.p2plending.borrower.service.imple;

import com.p2plending.borrower.dto.BorrowerCreateDto;
import com.p2plending.borrower.handler.BorrowerNotFoundException;
import com.p2plending.borrower.model.BorrowerModel;
import com.p2plending.borrower.repository.BorrowerRepository;
import com.p2plending.borrower.service.IBorrowerService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class BorrowerService implements IBorrowerService {

    @Autowired
    BorrowerRepository borrowerRepository;

    @Override
    public BorrowerModel createBorrower(BorrowerCreateDto borrowerCreateDto) {
        //save data db
        BorrowerModel borrowerModel = BorrowerModel.builder()
                .idUser(borrowerCreateDto.getIdUser())
                .firstName(borrowerCreateDto.getFirstName())
                .lastName(borrowerCreateDto.getLastName())
                .email(borrowerCreateDto.getEmail())
                .balance(borrowerCreateDto.getBalance())
                .pin(borrowerCreateDto.getPin())
                .build();
        return borrowerRepository.save(borrowerModel);
    }

    @Override
    public BorrowerModel updateBorrower(BorrowerCreateDto borrowerCreateDto, Integer id) {
        BorrowerModel borrowerModel = BorrowerModel.builder()
                .id(id)
                .idUser(borrowerCreateDto.getIdUser())
                .firstName(borrowerCreateDto.getFirstName())
                .lastName(borrowerCreateDto.getLastName())
                .email(borrowerCreateDto.getEmail())
                .balance(borrowerCreateDto.getBalance())
                .pin(borrowerCreateDto.getPin())
                .build();
        return borrowerRepository.save(borrowerModel);
    }

    @Override
    public Map<String, Object> deleteBorrower(Integer id) {

        if(borrowerRepository.findById(id).isEmpty())
            throw new BorrowerNotFoundException("Data yang dicari tidak ditemukan");

        BorrowerModel borrowerModel = borrowerRepository.findById(id).get();
        Map<String,Object> response = new LinkedHashMap<>();
        response.put("id", borrowerModel.getId());
        response.put("name", borrowerModel.getFirstName());
        response.put("email", borrowerModel.getEmail());
        borrowerRepository.deleteById(id);
        return response;
    }

    @Override
    public BorrowerModel getBorrower(Integer id) {
        if(borrowerRepository.findById(id).isEmpty())
            throw new BorrowerNotFoundException("Data yang dicari tidak ditemukan");
        return borrowerRepository.findById(id).get();
    }

    @Override
    public List<BorrowerModel> getAllCBorrower() {
        return borrowerRepository.findAll();
    }


}
