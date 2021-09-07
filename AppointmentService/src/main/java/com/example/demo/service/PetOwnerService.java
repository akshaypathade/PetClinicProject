package com.example.demo.service;
//
//import java.util.List;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import com.example.demo.model.Pet;
//import com.example.demo.model.PetOwner;
//
//@Service
//@FeignClient(name="petowner-service", fallback = PetOwnerServiceImpl.class)
//public interface PetOwnerService {
//	
//	
//	@GetMapping(value="/pet/owner/appointment/{appointmentId}")
//	List<PetOwner> findByAppointment(@PathVariable("appointmentId") Integer appointmentId );
//	
//	@PutMapping(value="pet/owner/{ownerId}")
//	PetOwner update(@PathVariable("ownerId") Integer ownerId);
//	
//	@DeleteMapping(value="pet/owner/{ownerId}")
//	void delete(@PathVariable("ownerId") Integer ownerId);
//	
//	@PostMapping(value="/pet/owner")
//	Pet save(@RequestBody PetOwner owner);
//	
//
//}
