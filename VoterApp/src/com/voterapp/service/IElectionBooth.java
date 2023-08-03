package com.voterapp.service;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;

public interface IElectionBooth {
	boolean checkEligibility(int age, String locality, int voterId) throws InValidVoterException, LocalityNotFoundException, NoVoterIDException;
}
