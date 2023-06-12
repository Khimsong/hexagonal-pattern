//package com.hexagonal.hexagonal.Core.Department;
//
//import com.hexagonal.hexagonal.App.Department.DepartmentRequest;
//import com.hexagonal.hexagonal.App.Department.DepartmentResponse;
//import com.hexagonal.hexagonal.Infra.Department.DepartmentEntity;
//
//import java.util.function.Function;
//
//public class Dto implements Function<DepartmentEntity, DepartmentResponse>{
//    @Override
//    public DepartmentResponse apply(DepartmentEntity departmentEntity) {
//        return new DepartmentResponse(
//                departmentEntity.getId(),
//                departmentEntity.getDepartmentName()
//        );
//    }
//
//    public static DepartmentEntity toEntity(DepartmentRequest departmentRequest)
//    {
//        return new DepartmentEntity(
//                departmentRequest.getDepartmentName()
//        );
//    }
//
//}
