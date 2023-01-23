/*
	@PutMapping(value ="/{id}")
	public ResponseEntity<Person> uptadePerson(@PathVariable("id") long id, @RequestBody Person person) { 
		return services.uptadeService(id, person);
	}
	
    @GetMapping("/{id}")
	public Person findbyId(@PathVariable("id") Long id) throws Exception {
    	 return services.findByIdService(id)
                 .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado."));	}

	 @PostMapping("/{id}/endereco")
	    public Optional<Person> novoEndereço(@PathVariable("id") Long id, @RequestBody List<Endereco> endereco)throws Exception{
	    	return Optional.ofNullable(services.setAddress(id, endereco));
	    }	
	
	@GetMapping(value = "/endereco/{id}")
	public List<Endereco> listAddressForPerson(@PathVariable("id") Long id){
		return services.addressForPerson(id);
	}
	
	@GetMapping(value = "/principal/{id}")
	public Endereco maindAddress(@PathVariable("id") Long id) {
		return services.principalAddress(id);
	}*/# rest-with-springboor-and-javaerudi