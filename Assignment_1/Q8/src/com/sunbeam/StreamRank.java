package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class StreamRank {
	private ArrayList<Integer> stream;

	public StreamRank() {
		this.stream = new ArrayList<>();
	}

	public void track(int x) {
		stream.add(x);
	}

	public int getRankOfNumber(int x) {
		Collections.sort(stream); // Sort the stream to determine the rank
		int rank = 0;
		for (int num : stream) {
			if (num <= x) {
				rank++;
			} else {
				break;
			}
		}
		return rank;
	}

	public static void main(String[] args) {
		StreamRank streamRank = new StreamRank();
		int[] input = { 10, 20, 15, 3, 4, 4, 1 };

		for (int num : input) {
			streamRank.track(num);
		}

		int numberToFindRank = 4;
		int rank = streamRank.getRankOfNumber(numberToFindRank);

		System.out.println("Rank of " + numberToFindRank + " is: " + rank);
	}
}
