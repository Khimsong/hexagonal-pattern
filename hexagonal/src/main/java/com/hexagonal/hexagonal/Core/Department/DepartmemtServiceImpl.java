//package com.hexagonal.hexagonal.Core.Department;
//
//import com.hexagonal.hexagonal.App.Department.DepartmentRequest;
//import com.hexagonal.hexagonal.App.Department.DepartmentResponse;
//import com.hexagonal.hexagonal.Infra.Department.DepartmentEntity;
//import com.hexagonal.hexagonal.Infra.Department.DepartmentRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//@RequiredArgsConstructor
//public class DepartmemtServiceImpl implements DepartmentService{
//
//    private final DepartmentRepository departmentRepository;
//    private final Dto dto;
//
//    @Override
//    public List<DepartmentResponse> findAll() {
//        return departmentRepository
//                .findAll()
//                .stream()
//                .map(dto)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public DepartmentResponse save(DepartmentRequest departmentRequest) {
//        return dto.apply(departmentRepository.save(Dto.toEntity(departmentRequest)));
//    }
//
//    @Override
//    public DepartmentResponse update(DepartmentRequest departmentRequest, Long id) {
//        return  null;
//    }
//
//    @Override
//    public DepartmentResponse delete(Long id) {
//        return null;
//    }
//}
