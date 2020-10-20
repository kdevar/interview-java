# Exercise Instructions

In this exercise, please utilize the provided interfaces to construct a program that will read a CSV file from the resources directory, apply the rules defined below and write a new file back to the resources directory

## Steps
Make the changes needed to:
1. Read [data.csv](./src/main/resources/data.csv) from the resources directory
2. Filter out the line items where the line_item_type is refund
3. When duplicate line_item_ids are encountered, keep the line item that has the highest cost
4. Write the filtered content to  new CSV file called data-filtered.csv

## Provided

There are three interfaces provided.  Please use them to construct your program.
1. [Reader](./src/main/java/io/finops/interview/readers/Reader.java)
2. [Writer](./src/main/java/io/finops/interview/writers/Writer.java)
3. [Processor](./src/main/java/io/finops/interview/processors/Processor.java)

Additionally, there is a utility to parse a CSV line.  [CSVHelper](./src/main/java/io/finops/interview/utils/CSVHelper.java)

## Verify

You can verify your work by running the junit tests