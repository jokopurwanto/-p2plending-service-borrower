package com.p2plending.borrower.service;

import com.p2plending.borrower.dto.BorrowerCreateDto;
import com.p2plending.borrower.model.BorrowerModel;

import java.util.List;
import java.util.Map;

public interface IBorrowerService {
    public BorrowerModel createBorrower(BorrowerCreateDto borrowerCreateDto);
    public BorrowerModel updateBorrower(BorrowerCreateDto borrowerCreateDto, Integer id);
    public Map<String, Object> deleteBorrower(Integer id);
    public BorrowerModel getBorrower(Integer id);
    public List<BorrowerModel> getAllCBorrower();



}
