`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date:    16:01:11 04/04/2018 
// Design Name: 
// Module Name:    multiplexer_behavior 
// Project Name: 
// Target Devices: 
// Tool versions: 
// Description: 
//
// Dependencies: 
//
// Revision: 
// Revision 0.01 - File Created
// Additional Comments: 
//
//////////////////////////////////////////////////////////////////////////////////
module multiplexer_behavior(
    input [3:0] X,
    input [1:0] C,
    output Y
    );
	 
	 reg out;
	 wire [1:0] select;
	 wire [3:0] x;
	 
	 assign select = C;
	 assign Y = out;
	 
	 always@(select)
		begin
			case(select)
				0 : out = X[0];
				1 : out = X[1];
				2 : out = X[2];
				3 : out = X[3];
			endcase
		end
		

	 
endmodule
